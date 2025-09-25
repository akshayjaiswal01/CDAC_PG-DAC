#include<iostream>
using namespace std;
int main()
{
    int a = 100;
    int& b = a;
    int& c = b;

    cout<<"a = "<<a <<endl;
    cout<<"b = "<<b<<endl;
    cout<<"c = "<<c<<endl;

    b = 200;

    cout<<"a = "<<a <<endl;
    cout<<"b = "<<b<<endl;
    cout<<"c = "<<c<<endl;

}