#include<iostream>
using namespace std;

int main()
{
    int a = 10;
    int b = 20;
    cout << "Before Swapping \n"<<"a="<<a<<" and b="<<b<<endl;
    swap(a, b);
    cout << "After Swapping \n" <<"a="<<a<<" and b="<<b<<endl;
}

void swap(int p, int q)
{
    int temp = p;
    p = q;
    q = temp;
}