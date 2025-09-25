#include<iostream>
#include<string>
using namespace std;

class Item
{   public:
    int itemID;
    string itemName;
    double itemPrice;

 
        Item()
        {
            itemID = 0;
            itemName = "";
            itemPrice = 0;
        }

        void input()
        {
            cout<<"Enter Item ID: "<<endl;
            cin>>itemID;

            cout<<"Enter Item Name: "<<endl;
            cin>>itemName;

            cout<<"Enter Item Price"<<endl;
            cin>>itemPrice;
        }

        void display()
        {
            cout<<"Item ID: "<<itemID<<endl;
            cout<<"Item Name: "<<itemName<<endl;
            cout<<"Item Price: "<<itemPrice<<endl;
        }

};

class Bill
{
    public:
    int billID;
    string customerName;
    Item purchased[10];
    int count;

        Bill()
        {
            billID = 0;
            customerName = "";
            count = 0;
        }

        void input()
        {
            cout<<"Enter Bill ID: "<<endl;
            cin>>billID;

            cout<<"Enter Customer Name: "<<endl;
            cin>>customerName;
        }

        Bill operator+(Item & it1)
        {
            purchased[count] = it1;
            count++;

            return *this;
        }

        void display()
        {
            cout<<"Bill ID: "<<billID<<endl;
            cout<<"Customer Name: "<<customerName<<endl;

            int total = 0;
            for(int i=0; i<3; i++)
            {
                cout<<"Item: "<<i+1<<endl;
                purchased[i].display();

                total = total + purchased[i].itemPrice;
            }

            cout<<total<<endl;

        }


};

int main()
{
    Item store[3];

    for(int i=0; i<3; i++)
    {
        store[i].input();
    }

    Bill b;
    b.input();
    int itemNo;
    cout<<"Enter Item No."<<endl;
    cin>>itemNo;
    
    b = b + store[itemNo - 1];
    b.display();



}