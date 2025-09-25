//Function Template

#include<iostream>
using namespace std;
template <class X, class Y>
void add(X &a, Y &b)
{
    Y res = a+b;
    cout<<"Addition of "<<a<<" and "<<b<<" is "<<res<<endl;
}

int main()
{
    int a = 10;     
    float b = 12.5;
    add(a,b);

}
