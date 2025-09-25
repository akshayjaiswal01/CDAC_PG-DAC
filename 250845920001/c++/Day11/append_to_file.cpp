#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    fstream my_file("example.txt", ios:: app);
    
        if(!my_file.is_open())
        {
            cout<<"Error in opening in file"<<endl;
        }
        else
        {
            cout<<"file opened"<<endl;
        }


        my_file <<"i'm from sambhajinagar"<<endl;
        my_file <<"i'm currently in pune"<<endl;

        my_file.close();
    
}