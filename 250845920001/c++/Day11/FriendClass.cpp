#include<iostream>
using namespace std;
class Demo
{
    private:
        int pvt_variable;

    protected:
        int prot_variable;

    public:
        Demo()
        {
            pvt_variable = 10;
            prot_variable = 20;
        }

    friend class fri;
};

class fri
{
    public:
        void display(Demo& t)
        {
            cout<<"Private Variable is: "<<t.pvt_variable<<endl;
            cout<<"Protected Variable is: "<<t.prot_variable<<endl;
        }
};

int main()
{
    Demo d;
    fri f;
    f.display(d);
}