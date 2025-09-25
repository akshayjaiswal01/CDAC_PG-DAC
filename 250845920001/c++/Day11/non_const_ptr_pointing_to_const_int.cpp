#include<iostream>
using namespace std;
int main()
{
    int a = 10;
    int y=20;

    const int *ptr = &a;

    cout<<*ptr<<endl;
    
    ptr = &y;

    cout<<*ptr<<endl;
}