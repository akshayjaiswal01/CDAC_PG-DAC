#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int base;
    int exponent;
    cout<<"Enter base"<<endl;
    cin>>base;
    cout<<"Enter exponent"<<endl;
    cin>>exponent;

    cout<<pow(base, exponent);
}