#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    ofstream my_file("abc.txt");

    if(!my_file.is_open())
    {
        cout<<"Error in opening in file"<<endl;
    }
    my_file.close();
}