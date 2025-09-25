#include<iostream>
#include<string.h>
using namespace std;

class Account
{
    int accno;
    char name[20];
    static float rateOfInterest;

    public:
        Account(int accno1, const char* name1)
        {
            accno = accno1;
            strcpy(name, name1);
        }
        void display()
        {
            cout<<"Acc No: "<<accno<<endl;
            cout<<"Name: "<<name<<endl;
            cout<<"Rate of Interest: "<<rateOfInterest<<endl;
        }
};

float Account :: rateOfInterest = 6.5;

int main()
{
    Account acc1(101, "Akshay");
    acc1.display();

    Account acc2(102, "Jay");
    acc2.display();
}