#include<iostream>
using namespace std;
int main()
{
    int a = 10;
    int y=20;

    int * const ptr = &a;

    cout<<*ptr<<endl;

    a = 5;
    cout<<*ptr;

}