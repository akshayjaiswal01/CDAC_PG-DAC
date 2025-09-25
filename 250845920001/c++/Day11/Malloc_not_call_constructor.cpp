#include<iostream>
#include<stdlib.h>
using namespace std;

class A
{
    public:
    A()
    {
        cout<<"A's default constructor called"<<endl;
    }
};

int main()
{
    A* a = new A();
    cout<<"Object of a class A is created"<<endl;
    cout<<"Created using new operator"<<endl;
    cout<<"========================================="<<endl;

    A* a1 = (A*)malloc(sizeof(A));
    cout<<"Object of a class A is created"<<endl;
    cout<<"Created using malloc function"<<endl;
}