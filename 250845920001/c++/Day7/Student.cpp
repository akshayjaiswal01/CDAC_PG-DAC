#include<iostream>
using namespace std;
#include<string.h>

class Student
{
    public: 
    int rollno;
    string dateofbirth;
    int marks;

    Student();
    void display();
};
Student :: Student()
{
    cout<<"Enter Roll No: "<<endl;
    cin>> rollno;

    cout<<"Enter date of birth: "<<endl;
    cin>> dateofbirth;

    cout<<"Enter Marks: "<<endl;
    cin>> marks;
}

void Student :: display()
{
    cout<<"==========Student Data============"<<endl;
    cout<<"Roll No. "<<rollno<<endl;
    cout<<"Date of Birth "<<dateofbirth<<endl;
    cout<<"Marks "<<marks<<endl;
}

void sortByRollno(Student arr[], int size)
{
    for(int i=0; i<size; i++)
    {
        for(int j=i+1; j<size; j++)
        {
            if(arr[i].rollno > arr[j].rollno)
            {
                swap(arr[i], arr[j]);
            }
        }
    }
}

void sortByDateofbirth(Student arr[], int size)
{
    for(int i=0; i<size; i++)
    {
        for(int j=0; j<size; j++)
        {
            if(arr[i].dateofbirth > arr[j].dateofbirth)
            {
                swap(arr[i], arr[j]);
            }
        }
    }
}

void sortByMarks(Student arr[], int size)
{
    for(int i=0; i<size; i++)
    {
        for(int j=0; j<size; j++)
        {
            if(arr[i].marks > arr[j].marks)
            {
                swap(arr[i], arr[j]);
            }
        }
    }
}

int main()
{
    int size;
    cout<<"Enter no. of students "<<endl;
    cin>>size;

    cout<<"Enter Students Data"<<endl;

    Student std[size];

    cout<<"Enter your choice"<<endl;
    cout<<"1. Sort By Roll No"<<endl;
    cout<<"2. Sort By Date of Birth"<<endl;
    cout<<"3. Sort By Marks"<<endl;
                                                                         
    int choice;
    cout<<"Enter Choice"<<endl;
    cin>>choice;

    switch(choice)
    {
        case 1:
            sortByRollno(std, size);
            for(int i=0; i<size; i++)
            {
                std[i].display();
            }
            break;

        case 2:
            sortByDateofbirth(std, size);
            for(int i=0; i<size; i++)
            {
                std[i].display();
            }
            break;

        case 3:
            sortByMarks(std, size);
            for(int i=0; i<size; i++)
            {
                std[i].display();
            }
            break;

        default:
            cout<<"Invalid choice..."; 
    } 
}