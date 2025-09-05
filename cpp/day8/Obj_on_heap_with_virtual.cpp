#include<iostream>
using namespace std;

class Employee
{
    int id;
    public:
    Employee();
    Employee(int);
    virtual int findSalary();
    virtual void display();
};

Employee :: Employee()
{
    cout<<"In default constructor of Employee"<<endl;
}

Employee :: Employee(int i)
{
    cout<<"In Parameterized constructor of Employee"<<endl;
    id = i;
}

int Employee :: findSalary()
{
    return 0;
}

void Employee :: display()
{
    cout<<"ID: "<<id<<endl;
}

class WageEmployee : public Employee
{
    int hrs, rate;
    public:
    WageEmployee();
    WageEmployee(int, int, int);
    int findSalary();
    void display();
};

WageEmployee :: WageEmployee()
{
    cout<<"In default constructor of WageEmployee"<<endl;
}

WageEmployee :: WageEmployee(int i, int h, int r) : Employee(i)
{
    cout<<"In Parameterized constructor of WageEmployee"<<endl;
    hrs = h;
    rate = r;
}

int WageEmployee :: findSalary()
{
    return hrs * rate;
}

void WageEmployee :: display()
{
    Employee :: display();
    cout<<"Hours: "<<hrs<<endl;
    cout<<"Rate: "<<rate<<endl;
}

int main()
{
    Employee* ptr = new WageEmployee(102, 5, 2000);
    cout<<"Salary: "<<ptr->findSalary()<<endl;
    ptr->display(); 
}