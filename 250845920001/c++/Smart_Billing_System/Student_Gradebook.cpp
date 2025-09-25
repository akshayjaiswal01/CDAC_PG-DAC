#include<iostream>
#include<string>
using namespace std;

class Student
{
    int rollno;
    string name;
    int marks[3];

    public:
        Student()
        {
            rollno = 0;
            name = "";
        }

        void input()
        {
            cout<<"Enter Student Roll No: "<<endl;
            cin>>rollno;
            if(rollno < 0)
            {
                throw "Roll No must be positive";
            }

            cout<<"Enter Student Name: "<<endl;
            cin>>name;

            cout<<"Enter Students Marks: "<<endl;

            for(int i=0; i<3; i++)
            {
                cout<<"Enter Marks of Subject "<<i+1<<endl;
                cin>>marks[i];
            }
        }

        void averageMarks()
        {
            
        }
};