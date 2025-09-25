#include<iostream>
using namespace std;
bool primeNo(int);
int main()
{
    int num;
    cout <<"Enter a Number "<<endl;
    cin >>num;
    
    bool isPrime = primeNo(num);

    if(isPrime == true)
    {
        cout<<num<<" is a prime number"<<endl;
    }
    else
    {
        cout<<num<<" is not a prime number"<<endl;
    }

}
bool primeNo(int num)
{
    for(int i=2; i<num; i++)
    {
        if(num % i == 0)
        {
            return false;
        }
        
    }
    return true;
}