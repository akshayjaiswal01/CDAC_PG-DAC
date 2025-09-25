#include<iostream>
#include<fstream>
using namespace std;
class A
{
    public:
    int a = 10;
    int b = 20;
};
class B
{
    public:
    int c = 20;
    int d = 40;

    B operator+(A & a_new)
    {
       this->c = this->c + a_new.a;
       this->d = this->d + a_new.b;
       cout<<this->c;
       cout<<this->d;
    }
};
int main()
{
    A a;
    B b;
    b+a;
    try 
    {
    fstream my_file("example.txt", ios::out);

    if(!my_file.is_open())
    {
        throw "file not found";
    }

    else
    {
        my_file<<"Hello"<<endl;
        my_file<<"Sidd";
    }

    my_file.close();


    fstream my_fil("example.txt", ios::in);
    string line;
    if(my_fil)
    {
        while(!my_fil.eof())
        {
            getline(my_fil, line);
            cout << line;
        }
    }

    else
    {
        throw "File not opened";
    }
    my_fil.close();



}
catch(const char * msg)
{
    cout<<"Error:"<<msg<<endl;
}

   



}


