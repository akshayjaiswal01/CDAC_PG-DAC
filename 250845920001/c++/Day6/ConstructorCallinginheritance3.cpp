#include<iostream>
using namespace std;
class A
{
	int a;
public:
	A(int);
    void display();
 };
A::A(int p)
{
	cout<<"in parameterized constructor of A"<<endl;
	a=p;
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
B::B(int p,int q):A(p)
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
	B bobj(10,20);
	bobj.display();
}