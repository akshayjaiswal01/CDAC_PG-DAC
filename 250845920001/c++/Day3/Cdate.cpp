#include<iostream>
using namespace std;

class Cdate
{
    int dd;
    int mm;
    int yy;

    public:
    void accept();
    void display();
    void setDd(int);
    int getDd();
    int getMm();
};

void Cdate :: accept()
{
    cout << "Enter date, month and year \n";
    cin>>dd>>mm>>yy;
}

void Cdate :: display()
{
    cout << "date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}

void Cdate :: setDd(int d)
{
    dd = d;
}

int Cdate :: getDd()
{
    return dd;
}

int Cdate :: getMm()
{
    return mm;
}

int main()
{
    Cdate d1;

    d1.accept();
    d1.display();
    d1.setDd(23);
    d1.display();
    cout<<"Date : "<<d1.getDd()<<endl;;
    cout<<"Month : "<<d1.getMm();
}


