#include<iostream>
using namespace std;

class Company
{
    float bonus = 20000;
    public:
        float getBonus()
        {
            return bonus;
        }
};

class Employee : public Company
{
    float salary = 30000;

    public:
     float calculateSalary()
    {
        return getBonus() + salary;
    }
};

int main()
{
    Employee e;
    cout<<"Salary is "<<e.calculateSalary();
}