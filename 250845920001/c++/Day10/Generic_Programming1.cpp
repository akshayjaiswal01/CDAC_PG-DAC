// Function Template

#include<iostream>
using namespace std;
template <class T>
T add(T &a, T &b)
{
    T res = a+b;
    return res;
}

int main()
{
    int i = 10;
    int j = 20;
    float x = 2.5;
    float y = 2.5;

    cout<<"Addition of "<<i<<" and "<<j<<" is "<<add(i, j)<<endl;
    cout<<"Addition of "<<x<<" and "<<y<<" is "<<add(x, y)<<endl;
}
