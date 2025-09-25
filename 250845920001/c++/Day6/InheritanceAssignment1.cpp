#include<iostream>
using namespace std;
class A
{
	int c = 30;
public:
	int a=10;
protected:
	int b=20;
public:
	void display()
	{
		cout<<"in display of A\n";
	}
};

class B:private A
{
public:
	int c;
public:
	void show()
	{
	    display();
		cout<<a<<b;
	}
};


int main()
{
	B bobj;
	bobj.show();
//	bobj.display(); not allowed
}