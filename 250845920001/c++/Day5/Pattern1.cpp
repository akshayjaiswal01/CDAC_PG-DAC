#include<iostream>
using namespace std;
int main()
{
    int n=5;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<i; j++)
        {
        if(i==((n-1)-i) && j==((n-1)-j))
        {
            cout<<" ";
        }
        else
        {
            cout<<"* ";
        }
        }
        cout<<endl;
    }
}