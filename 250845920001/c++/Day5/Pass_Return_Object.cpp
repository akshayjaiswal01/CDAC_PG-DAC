#include<iostream>
using namespace std;
class Temp
{
    int a;
    public:
        void setData()
        {
            cin>>a;
        }

        Temp add(Temp& b1)
        {
            Temp aobj3;
            aobj3.a = this->a + b1.a;
            return aobj3;
        }

        void show()
        {
            cout<<"value is "<<a;
        }
};

int main()
{
    Temp aobj1, aobj2;
    aobj1.setData();
    aobj2.setData();

    Temp aobj4 = aobj1.add(aobj2);
    aobj4.show();
}