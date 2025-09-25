#include<iostream>
using namespace std;

class A
{
    public:
        A()
        {
            cout<<"A's default constructor called"<<endl;
        }
};

class B
{
    public:
        B()
        {
            cout<<"B's default constructor called"<<endl;
        }
};

class C : public B, public A
{
    public:
        C()
        {
            cout<<"C's default constructor called"<<endl;
        }
};

int main()
{
    C c;
}