#include<iostream>
using namespace std;
void show();
int a = 10;
int main()
{
    cout <<"a = "<<a<<endl;
    a++;
    cout <<"a = "<<a<<endl;
    show();
    cout <<"a = "<<a<<endl;
}

void show()
{
    int b = 0;
    cout<<"b = "<<b<<endl;
    b++;
    cout<<"a = "<<a<<endl;
}