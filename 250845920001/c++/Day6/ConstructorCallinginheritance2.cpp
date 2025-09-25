#include<iostream>
using namespace std;
class A
{
	int a;
public:
	A();
    void display();
 };
A::A()
{
	cout<<"in default constructor of A"<<endl;
	a=100;
}
void A::display()
{
	cout<<"a = "<<a<<endl;
}
class B:public A
{
	int b;
public:
	B(int,int);
	void display();
};
B::B(int p,int q)
{
	cout<<"in parameterized constructor of B"<<endl;
	b=q;
}
void B::display()
{
	A::display();
	cout<<"b = "<<b<<endl;
}
int main()
{
	B b(10,20);
	b.display();
}