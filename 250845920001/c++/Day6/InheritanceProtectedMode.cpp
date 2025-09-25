#include<iostream>
using namespace std;

class Base
{
    private:
        int pvt = 100;

    protected:
        int prot = 200;

    public:
        int pub = 300;

        int getPrivate()
        {
            return pvt;
        }
};

class ProtectedDerived : protected Base
{
    public:
        int getProtected()
        {
            return prot;
        }

        int getPublic()
        {
            return pub;
        }

};

int main()
{
    ProtectedDerived pd;
    cout<<"Public pub is "<<pd.getPublic()<<endl;
    // cout<<"Private pvt is "<<pd.getPrivate()<<endl;  error
    cout<<"Protected prot is "<<pd.getProtected()<<endl;
}