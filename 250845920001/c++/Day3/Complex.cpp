#include<iostream>
using namespace std;
class Complex
{
    int real;
    int img;

    public:
    Complex();
    Complex(int, int);
    void display() const;
    void setReal(int);
    int getReal() const;
};

Complex :: Complex()
{
    cout <<"In No Arguments Constructor "<<endl;
    real = 1;
    img = 2;
}

Complex :: Complex(int r, int i)
{
    cout <<"In Para Constructor "<<endl;
    real = r;
    img = i;
}

void Complex :: display() const
{
    cout << "complex No is "<<real<<"+"<<img<<"i"<<endl;
}

void Complex :: setReal(int r)
{
    real = r;
}

int Complex :: getReal() const
{
    return real;
}

int main()
{
    Complex c1;
    c1.display();
    c1.setReal(5);
    c1.display();
    cout <<"Real part is "<<c1.getReal()<<endl;;

    const Complex c2(10, 20);
    c2.display();
    cout <<"Real Part is "<<c2.getReal()<<endl;
}