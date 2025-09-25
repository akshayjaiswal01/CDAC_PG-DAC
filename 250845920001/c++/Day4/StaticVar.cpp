#include<iostream>
using namespace std;
void show();
static int a = 10; // global static variable 
int main()
{
    cout <<"a = "<<a<<endl;
    a++;
    cout <<"a = "<<a<<endl;
    show();
}

void show()
{
    a++;
    cout <<"a = "<<a<<endl;
}