#include<iostream>
using namespace std;

class Parent
{
    public:
        int parent_id;
};

class Child : public Parent
{
    public:
        int child_id;
};

int main()
{
    Child c;
    c.parent_id = 101;
    c.child_id = 201;
    cout<<"Parent Id is "<<c.parent_id<<endl;
    cout<<"Child Id is "<<c.child_id<<endl;

    Parent p;
    p.parent_id = 1;
    // p.child_id = 2;  error bcz parent class object access only parent class members
    cout<<"Parent Id is "<<p.parent_id<<endl;
}