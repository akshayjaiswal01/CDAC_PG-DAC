#include<iostream>
using namespace std;

class Parent
{
    protected:
        int id_protected;
};

class Child : public Parent
{
    public:
        void setId(int id)
        {
            id_protected = id;
        }
        void display()
        {
            cout<<"ID is "<<id_protected<<endl;
        }
};

int main()
{
    Child c;

    c.setId(101);
    c.display();
}