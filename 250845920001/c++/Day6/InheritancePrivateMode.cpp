#include<iostream>
using namespace std;

class Base
{
    private:
        int pvt = 1000;

    protected:
        int prot = 2000;

    public:
        int pub = 3000;

        int getPrivate()
        {
            return pvt;
        }
};

class PrivateDerived : private Base
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
    PrivateDerived pd;
    cout<<"Public pub is "<<pd.getPublic()<<endl;
    //cout<<"Private pvt is "<<pd.getPrivate()<<endl;  // error
    cout<<"Protected prot is "<<pd.getProtected()<<endl;
}