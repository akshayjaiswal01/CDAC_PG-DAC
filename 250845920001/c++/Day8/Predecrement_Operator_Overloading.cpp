#include<iostream>
using namespace std;

class Complex
{
    int real; 
    int img;

    public:
        Complex();
        Complex(int, int);
        void display();
        Complex operator--();
        
};

Complex :: Complex()
{
    cout<<"In default const of Complex"<<endl;
}

Complex :: Complex(int real, int img)
{
    cout<<"In para const of Complex"<<endl;
    this->real = real;
    this->img = img;
}

void Complex :: display()
{
    if(img > 0)
    {
        cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
    }
    else
    {
        cout<<"complex number is "<<real<<img<<"i"<<endl;
    }
}

Complex Complex :: operator--()
{
    this->real--;
	this->img=this->img-1;
	return (*this);
}

int main()
{
    Complex c1(1, 2);
    Complex c2 = --c1;
    c1.display();
    c2.display();
}