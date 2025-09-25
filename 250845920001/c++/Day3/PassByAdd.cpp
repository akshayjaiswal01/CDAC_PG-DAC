#include<iostream>
using namespace std;
void swap(int*, int*);

int main()
{
    int a = 20;
    int b = 30;
    cout << "Before Swapping \n"<<"a="<<a<<" and b="<<b<<endl;
    swap(&a, &b);
    cout << "After Swapping \n" <<"a="<<a<<" and b="<<b<<endl;
}

void swap(int* p, int* q)
{
    int temp = *p;
    *p = *q;
    *q = temp;
}