#include<iostream>
using namespace std;
void add(int a=1, int b=2, int c=3, int d=4);
int main()
{
    add();
    add(10);
    add(10,20);
    add(10,20,30);
    add(10,20,30,40);
}
void add(int a, int b, int c, int d)
{
    cout<<a+b+c+d<<endl;
}