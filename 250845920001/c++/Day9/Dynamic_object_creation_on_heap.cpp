#include<iostream>
using namespace std;
class cdate
{
    int dd,mm,yy;
    public:
    cdate()
    {
        dd=0;
        mm=0;
        yy=0;

    }
    cdate(int d, int m, int y)
    {
        dd=d;
        mm=m;
        yy=y;

    }
    void show()
    {
        cout<<"dd="<<dd<<" mm="<<mm<<" yy="<<yy<<endl;


    }
    ~cdate()
    {
        cout<<"Destructor called"<<endl;
    }


};
int main()
{
    cdate* ptr1= new cdate(1, 9, 2025);
    ptr1->show();
    delete ptr1;
}