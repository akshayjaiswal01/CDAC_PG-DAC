#include<iostream>
using namespace std;
int main() 
{
    int a[5];

    // Using Subscript notation 
    // cout<<"Enter Elements in Array "<<endl;
    // for(int i=0; i<=4; i++)
    // {
    //     cin>>a[i];
    // }

    // cout<<"Elements of Array is "<<endl;
    // for(int i=0; i<=4; i++)
    // {
    //     cout << a[i]<<"\t";
    // }


    // Using Pointer Notation
    cout<<"Enter Elements in Array "<<endl;
    for(int i=0; i<=4; i++)
    {
        cin >> *(a+i);
    }

    cout<<"Elements of Array is "<<endl;
    for(int i=0; i<=4; i++)
    {
        cout << *(a+i)<<"\t";
    }


}