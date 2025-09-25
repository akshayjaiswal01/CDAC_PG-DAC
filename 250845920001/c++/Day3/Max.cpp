#include<iostream>
using namespace std;

int main()
{
    int a[5];

    cout <<"Enter Elements of Array "<<endl;
    for(int i=0; i<=4; i++)
    {
        cin >> a[i];
    }

    cout << "Elements of Array is "<<endl;
    for(int i=0; i<=4; i++)
    {
        cout << a[i]<<"\t";
    }
    cout<<endl;
    int max = 0;
    for(int i=0; i<=4; i++)
    {
        if(a[i] > max)
        {
            max = a[i];
        }
    }

    cout << "Maximum Element in Array is "<<max;
}