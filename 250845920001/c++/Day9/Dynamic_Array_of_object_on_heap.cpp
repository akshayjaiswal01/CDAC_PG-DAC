#include<iostream>
using namespace std;
class Student
{
    int rollno;
    char name[20];

    public:
        void accept()
        {
            cin>>rollno;
            cin>>name;
        }

        void display()
        {
            cout<<"Roll no = "<<rollno<<" Name = "<<name<<endl;
        }

        ~Student()
        {
            cout<<"Destructor is called"<<endl;
        }
};

int main()
{
    int no;
    cout<<"Enter no of students"<<endl;
    cin>>no;

    Student* ptr = new Student[no];

    cout<<"Enter Student Details"<<endl;
    for(int i=0; i<no; i++)
    {
        ptr[i].accept();
    }

    cout<<"Students Details are"<<endl;
    for(int i=0; i<no; i++)
    {
        ptr[i].display();
    }
    
    delete[] ptr;
}