#include<iostream>
using namespace std;

int main()
{
    int* ptr;
    int n;

    cout<<"Enter no of element"<<endl;
    cin>>n;

    ptr = (int*)malloc(n*sizeof(int));

    cout<<"Enter Elements"<<endl;
    for(int i=0; i<n; i++)
    {
        cin>>ptr[i];
    }

    cout<<"Display elements"<<endl;
    for(int i=0; i<n; i++)
    {
        cout<<ptr[i]<<" ";
    }


}