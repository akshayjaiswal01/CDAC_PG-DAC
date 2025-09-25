#include<iostream>
using namespace std;

int main()
{
    int a[5];
    cout<< "Enter the elements of array"<<endl;

    for(int i=0; i<=4; i++)
    {
        cin>>a[i];
    }

    cout<<"Original Array is"<<endl;
    for(int i=0; i<=4; i++)
    {
        cout<<a[i]<<"\t";
    }
    cout<<endl;

    int b[5];
    for(int i=0; i<=4; i++)
    {
        b[i] = a[i];
    }

    cout<<"Copied Array is"<<endl;
    for(int i=0; i<=4; i++)
    {
        cout<<b[i]<<"\t";
    }
}