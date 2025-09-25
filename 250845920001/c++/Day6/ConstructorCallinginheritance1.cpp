#include<iostream>
using namespace std;

class A
{
    int a;

    public:
        A();
        void display();
};
A :: A()
{
    cout<<"In default constructor of class A"<<endl;
    a = 10;
}
void A :: display()
{
    cout<<"a = "<<a<<endl;
}


class B : public A
{
    int b;
    public:
        B();
        void display();
};
B :: B()
{
    cout<<"In default constructor of class B"<<endl;
    b = 20;
}
void B :: display()
{
    A :: display();
    cout<<"b = "<<b<<endl;
}

int main()
{
    B b;
    b.display();
}