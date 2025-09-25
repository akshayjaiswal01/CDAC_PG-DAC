#include<iostream>
using namespace std;
class Employee
{
    int id;
    char name[30];
    public:
        void setData();
        void getData();
};

void Employee :: setData()
{
    cout<<"Enter ID: "<<endl;
    cin>>id;
    cout<<"Enter Name: "<<endl;
    cin>>name;
}

void Employee :: getData()
{
    cout<<"ID: "<<id<<" ";
    cout<<"Name: "<<name<<" ";
    cout<<endl;
}

int main()
{
    int n;
    cout<<"Enter no. of employee"<<endl;
    cin>>n;

    Employee emp[n];

    cout<<"accessing data"<<endl;
    for(int i=0; i<n; i++)
    {
        emp[i].setData();  //(emp+i)->setData()
    }

    cout<<"display data"<<endl;
    for(int i=0; i<n; i++)
    {
        emp[i].getData();   //(emp+i)->geyData()
    }
}