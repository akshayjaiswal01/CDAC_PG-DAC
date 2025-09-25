//Constant Object

#include<iostream>
using namespace std;

class Cdate
{
    int day, month, year;
    public:
        int getDay () const;

        Cdate(int d, int m, int y)
        {
            day = d;
            month = m;
            year = y;
        }

        int setDay(int d)
        {
            day = d;
        }

        void display()
        {
            cout<<"date is "<<day<<"/"<<month<<"/"<<year<<endl;
        }
};

int Cdate :: getDay() const
{
    return day;
}

int main()
{
    const Cdate d1(25, 8, 2025);
    cout<<"Date is "<<d1.getDay()<<endl;

    Cdate d2(26, 8, 2025);
    d2.display();
    d2.setDay(27);
    d2.display();
    
}