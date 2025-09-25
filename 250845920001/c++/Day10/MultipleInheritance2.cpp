#include<iostream>
using namespace std;

class A
{
    int a;
    public:
        A()
        {
            cout<<"A's default constructor called"<<endl;
        }

        A(int p)
        {
            cout<<"A's Para constructor called"<<endl;
        }
};

class B
{
    int b;
    public:
        B()
        {
            cout<<"B's default constructor called"<<endl;
        }

        B(int q)
        {
            cout<<"B's Para constructor called"<<endl;
        }
};

class C : public B, public A
{
    int c;
    public:
        C()
        {
            cout<<"C's default constructor called"<<endl;
        }

        C(int p, int q) : A(p), B()
        {
            cout<<"C's Para constructor called"<<endl;
        }
};

int main()
{
    C c(10, 20);
}