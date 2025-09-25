#include<iostream>
using namespace std;

int main()
{
    int terms;
    int nextterm;
    int t1=0, t2=1;
    cout<<"Enter the no. of term"<<endl;;
    cin>>terms;

    for(int i=3; i<=terms; i++)
    {
        cout<<t1<<" ";
        nextterm = t1 + t2;
        t1 = t2; 
        t2 = nextterm;
    }

}