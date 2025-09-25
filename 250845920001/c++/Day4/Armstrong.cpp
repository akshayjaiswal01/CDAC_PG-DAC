#include<iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a Number "<<endl;
    cin >>num;
    int original = num;
    int arm = 0;
    while(num != 0)
    {
        int rem = num % 10;
        arm = arm + (rem * rem * rem);
        num = num / 10;
    }

    if(original == arm)
    {
        cout<<original<<" is a armstrong number"<<endl;
    }
    else
    {
        cout<<original<<" is not a armstrong number"<<endl;
    }
}