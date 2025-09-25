#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;

class Item
{
    int itemID;
    string itemName;
    double price;
    int stockQuantity;

    public:
        Item()
        {
            itemID = 0;
            itemName = "";
            price = 0;
            stockQuantity = 0;
        }

        void input()
        {
            cout<<"Enter Item ID: "<<endl;
            cin>>itemID;
            if(itemID < 0)
            {
                throw "Item ID cannot be negative";
            }

            cout<<"Enter Item Name: "<<endl;
            cin>>itemName;

            cout<<"Enter Item Price: "<<endl;
            cin>>price;
            if(price < 0)
            {
                throw "Item Price must be positive";
            }

            cout<<"Enter Stock Quantity"<<endl;
            cin>>stockQuantity;
            if(stockQuantity < 0)
            {
                throw "Stock Quantity cannot be negative";
            }
        }

        void display()
        {
            cout<<"Item ID: "<<itemID<<" "
                <<"Item Name: "<<itemName<<" "
                <<"Item Price: "<<price<<" "
                <<"Stock Quantity: "<<stockQuantity<<" "<<endl;
        }

        int getItemID()
        {
            return itemID;
        }

        string getItemName()
        {
            return itemName;
        }

        double getItemPrice()
        {
            return price;
        }

        int getStockQuantity()
        {
            return stockQuantity;
        }

        void reduceStockQuantity(int qty)
        {
            if(qty > stockQuantity)
            {
                throw "not enough stock";
            }

            stockQuantity = stockQuantity - qty;
        }
};

class Bill
{
    int billID;
    string customerName;
    Item purchased[10];
    int quantity[10];
    int count;

    public:
        Bill()
        {
            billID = 0;
            customerName = "";
            count = 0;
        }

        int getBillID()
        {
            return billID;
        }

        int getCount()
        {
            return count;
        }

        string getCustomerName()
        {
            return customerName;
        }

        Item getItem(int i)
        {
            return purchased[i];
        }

        int getQuantity(int i)
        {
            return quantity[i];
        }

        void createBill()
        {
            cout<<"Enter Bill ID: "<<endl;
            cin>>billID;
            if(billID < 0)
            {
                throw "Bill ID must be positive";
            }

            cout<<"Enter Customer Name: "<<endl;
            cin>>customerName;  
        }

        Bill operator+(Item & it)
        {
            int q;
            cout<<"Enter Quantity of Item: "<<it.getItemName()<<endl;
            cin>>q;
            if(q < 0)
            {
                throw "Quantity must be positive";
            }

            it.reduceStockQuantity(q);

            purchased[count] = it;
            quantity[count] = q;
            count++;

            return *this;
        }      
};

ostream &operator<<(ostream & out, Bill & b)
{
    if(b.getCount() == 0)
    {
        out<<"Bill is Empty"<<endl;
        return out;
    }

    out<<"Bill ID: "<<b.getBillID()<<endl;
    out<<"Customer Name: "<<b.getCustomerName()<<endl;

    double total = 0;
    for(int i=0; i<b.getCount(); i++)
    {
        double amount = b.getItem(i).getItemPrice() * b.getQuantity(i);

        out<<b.getItem(i).getItemName()
            <<" x"<<b.getQuantity(i)
            <<" ="<<amount<<endl;

        total = total + amount;
    }

    out<<"Total = "<<total<<endl;

    return out;
    
}

void saveBillToFile(Bill & b)
{
    ofstream my_file("bill.txt", ios::app);
    if(my_file)
    {
        my_file << b;

        cout<<"Bill Save to file.."<<endl;
        my_file.close();
    }

    else
    {
        cout<<"Failed to save file!!"<<endl;
    }
}

void loadBillsFromFile()
{
    ifstream my_file("bill.txt");
    if(my_file)
    {
        cout<<"===Privious Bills==="<<endl;
        string line;

        while(getline(my_file, line))
        {
            cout<< line <<endl;
        }
        cout<<"============================="<<endl;

        my_file.close();
    }
    else
    {
        cout<<"No Previous bills found"<<endl;
    }
}

int main()
{
    loadBillsFromFile();

    int n = 5;
    // cout<<"Enter no. of Item in store"<<endl;
    // cin>>n;

    Item store[5];

    for(int i=0; i<n; i++)
    {
        cout<<"Enter details of Item "<<(i+1)<<endl;
        try
        {
            store[i].input();
        }
        catch(const char* msg)
        {
            cout << "Error: " << msg << endl;
            i--;
        }
        
        
    }

    Bill b;
    b.createBill();

    int choice = 0;

    while(choice != 4)
    {
        cout<<"=====MENU====="<<endl;
        cout<<"1. Add Item to Bill"<<endl;
        cout<<"2. Show Bill"<<endl;
        cout<<"3. View all Bill"<<endl;
        cout<<"4. Exit"<<endl;

        cout<<"Enter Choice: "<<endl;
        cin>>choice;

        switch(choice)
        {
            case 1:
                cout<<"Available Items: "<<endl;
                for(int i=0; i<n; i++)
                {
                    cout<< i+1 <<". ";
                    store[i].display();
                }

                int itemIndex;
                cout<<"Enter Item No. to Add: "<<endl;
                cin>>itemIndex;

                try
                {
                    b = b + store[itemIndex - 1];
                    cout<<"Item added to bill"<<endl;
                }
                catch(const char * msg)
                {
                    cout<<"Error: "<< msg <<endl;
                }
                
                break;

            case 2:
                cout << b <<endl;
                break;
            
            case 3:
                loadBillsFromFile();
                break;

            case 4:
                try
                {
                    saveBillToFile(b);
                }
                catch(...)
                {
                    cout<<"Failed to save bill"<<endl;
                }

                cout<<"Exiting..."<<endl;
                break;

            default:
                cout<<"Invalid choice"<<endl;     
        }
    }
}