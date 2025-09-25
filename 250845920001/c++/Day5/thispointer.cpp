#include<iostream>
using namespace std;

class Demo
{
    int a, b;
    public:
        Demo(int a, int b)
        {
            this->a = a;
            this->b = b;
        }

        void display()
        {
            cout<<"a = "<<a<<" b = "<<b;
        }
};
int main()
{
    Demo d(10, 20);
    d.display();
}