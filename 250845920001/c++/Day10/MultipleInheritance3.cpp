#include<iostream>
using namespace std;

class Person
{
    public:
    Person(int x)  
    { 
        cout << "Person::Person(int ) called" << endl;   
    }
    Person()
    { 
        cout << "Person::Person() called" << endl;   
    }
};

class Faculty : virtual public Person
{
    public:
    Faculty(int y) : Person(y)
    { 
        cout << "Faculty::Faculty(int ) called" << endl;   
    }
    Faculty()
    { 
        cout << "Faculty::Faculty() called" << endl;   
    }
};

class Student : virtual public Person
{
    public:
    Student(int z)  : Person(z)
    { 
        cout << "Student::Student(int ) called" << endl;   
    }
    Student()
    { 
        cout << "Student::Student() called" << endl;   
    }
};

class TA : public Faculty, public Student
{
    public:
    TA(int a) : Student(a), Faculty(a), Person(a)  
    { 
        cout << "TA::TA(int ) called" << endl;   
    }
    TA()
    { 
        cout << "TA::TA() called" << endl;   
    }
};
int main()
{
    TA ta(10);
}


