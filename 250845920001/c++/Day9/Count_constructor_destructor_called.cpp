#include<iostream>
using namespace std;
static int count = 0;
class Test
{
    public:
    Test()
    {
        count++;
        cout<<"No. of object created: "<<count<<endl;
    }
    ~Test()
    {
        cout<<"No. of object destroyed: "<<count<<endl;
        count--;
    }
};
int main()
{
    Test t, t1, t2, t3;
}