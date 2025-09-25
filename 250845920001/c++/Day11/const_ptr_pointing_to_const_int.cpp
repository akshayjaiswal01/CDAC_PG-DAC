#include<iostream>
using namespace std;
int main()
{
    int a = 10;
    int y = 20;

    const int * const ptr = &a;

    cout<<*ptr<<endl;

    // *ptr = 5;  not allowed

    // ptr = &y; not allowed
}