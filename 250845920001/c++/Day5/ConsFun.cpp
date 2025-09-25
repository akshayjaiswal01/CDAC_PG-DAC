//Constant Member function 

#include<iostream>
using namespace std;

class Demo
{
    int x;
    public:
    void setdata(int a);
    int getdata() const;
};

void Demo :: setdata(int a)
{
    x = a;
}

int Demo :: getdata() const
{
    return x;
}

int main()
{
    Demo d;
    d.setdata(10);
    cout<<d.getdata();
}