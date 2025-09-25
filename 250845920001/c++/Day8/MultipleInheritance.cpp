#include<iostream>
using namespace std;

class A
{
    public:
        A()
        {
            cout<<"A constructor called"<<endl;
        }
};

class B
{
    public:
        B()
        {
            cout<<"B constructor called"<<endl;
        }
};

class C : public B, public A
{
    public:
        C()
        {
            cout<<"C constructor called"<<endl;
        }
};

int main()
{
    C* c = new C();
}