#include<iostream>
using namespace std;

int Max(int arr[])
{
    int max = 0;
    for(int i=0; i<5; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
}

int secMax(int arr[])
{
    int max = Max(arr);
    int secmax = 0;
    for(int i=0; i<5; i++)
    {
        if(arr[i] > secmax && arr[i] != max)
        {
            secmax = arr[i];
        }
    }
    return secmax;
}
int main()
{
    int arr[5];

    cout<<"Enter Elements of array"<<endl;
    for(int i=0; i<5; i++)
    {
        cin>> arr[i];
    }

    int max = Max(arr);
    int secmax = secMax(arr);

    cout<<"Max element is "<<max<<endl;
    cout<<"Second Max element is "<<secmax<<endl;
}