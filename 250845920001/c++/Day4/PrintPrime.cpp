#include<iostream>
using namespace std;
bool isPrime(int);
void printPrime(int);
int main()
{
    int num;
    cout <<"Enter a Number "<<endl;
    cin >>num;
    printPrime(num);
}
bool isPrime(int num)
{
    for(int i=2; i<num; i++)
    {
        if(i<=1)
        {
            return false;
        }
        if(num % i == 0)
        {
            return false;
        }
        
    }
    return true;
}
void printPrime(int num)
{
    for(int i=2; i<num; i++)
    {
        if(isPrime(i))
        {
            cout<<i<<" ";
        }
    }
}