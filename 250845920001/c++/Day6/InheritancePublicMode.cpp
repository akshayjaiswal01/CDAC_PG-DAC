#include<iostream>
using namespace std;

class Base
{
    private:
         int pvt = 10;

    protected:
        int prot = 20;

    public:
        int pub = 30;

    int getPrivate()
    {
        return pvt;
    }
};

class PublicDerived : public Base
{
    public:
        int getProtected()
        {
            return prot;
        }
};

int main()
{
    PublicDerived pd;
    cout<<"Public pub is "<<pd.pub<<endl;
    cout<<"Private pvt is "<<pd.getPrivate()<<endl;
    cout<<"Protected prot is "<<pd.getProtected()<<endl;
}