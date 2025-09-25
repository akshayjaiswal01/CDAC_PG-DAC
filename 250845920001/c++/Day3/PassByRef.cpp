#include<iostream>
using namespace std;

int main()
{
    int a = 10;
    int b = 20;
    cout << "Before Swapping \n"<<"a="<<a<<" and b="<<b<<endl;

    int &a_new = a;
    int &b_new = b;
    
    swap(a_new, b_new);
    cout << "After Swapping \n" <<"a="<<a<<" and b="<<b<<endl;
    cout << "After Swapping \n" <<"a_new="<<a_new<<" and b_new="<<b_new<<endl;

}

void swap(int p, int q)
{
    int temp = p;
    p = q;
    q = temp;
}