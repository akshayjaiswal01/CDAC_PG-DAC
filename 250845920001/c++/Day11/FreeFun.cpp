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

    ~A()
    {
        cout<<"A's destructor called"<<endl;
    }
};

int main()
{
    A* a = new A();
    cout<<"Object of a class A is created"<<endl;
    cout<<"Created using new operator"<<endl;
    cout<<endl;

    delete a;
    cout<<"Object a is deleted"<<endl;
    cout<<"Using delete operator"<<endl;

    cout<<"================================================="<<endl;


    A* b = (A*)malloc(sizeof(A));
    cout<<"Object of class A is created"<<endl;
    cout<<"Using malloc function"<<endl;
    cout<<endl;

    free(b);
    cout<<"Object b is deleted"<<endl;
    cout<<"Using free function"<<endl;
}