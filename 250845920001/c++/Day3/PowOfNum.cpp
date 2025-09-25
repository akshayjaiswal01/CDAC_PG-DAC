#include<iostream>
using namespace std;

int main()
{
    int num;
    int pow;
    int res = 1;
    cout << "Enter Number "<<endl;
    cin >> num;
    cout << "Enter Power "<<endl;
    cin >> pow;

    for(int i=1; i<=pow; i++)
    {
        res = res * num;
    }

    cout << num<<"^"<<pow<<" = "<<res; 
}