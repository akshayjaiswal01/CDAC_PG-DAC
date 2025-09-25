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
        Complex operator+(Complex&);
        Complex operator-(Complex&);
};

Complex :: Complex()
{
    cout<<"In default const of Complex"<<endl;
}

Complex :: Complex(int r, int i)
{
    cout<<"In para const of Complex"<<endl;
    this->real = r;
    this->img = i;
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

Complex Complex :: operator+(Complex & c2_new)
{
    Complex temp;
    temp.real = this->real + c2_new.real;
    temp.img = this->img + c2_new.img;
    return temp;
}

Complex Complex :: operator-(Complex & c2_new)
{
    Complex temp;
    temp.real = this->real - c2_new.real;
    temp.img = this->img - c2_new.img;
    return temp;
}

int main()
{
    // Complex c1(1, 2);
    // Complex c2(3, 4);

    // Complex c3 = c1 + c2;
    // c3.display();


    Complex c1(1, 2);
    Complex c2(3, 4);

    Complex c3 = c1 - c2;
    c3.display();
}