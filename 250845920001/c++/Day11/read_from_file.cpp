#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    ifstream my_file("example.txt");

    if(!my_file.is_open())
    {
        cout<<"Error in opening in file"<<endl;
    }
    else
    cout<<"file opened"<<endl;

    string line;

    while(!my_file.eof())
    {
        getline(my_file, line);

        cout<<line<<endl;
    }

    my_file.close();

}