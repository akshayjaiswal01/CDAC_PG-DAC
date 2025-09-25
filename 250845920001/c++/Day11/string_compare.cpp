#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str1[20];
    char str2[20];

    cout<<"Enter str1"<<endl;
    cin>>str1;

    cout<<"Enter str2"<<endl;
    cin>>str2;

    int x = strcmp(str1, str2);

    if(x == 1)
    {
        cout<<"String1 is greater"<<endl;
    }
    else if(x == -1)
    {
        cout<<"String2 is greater"<<endl;
    }
    else{
        cout<<"Both are equal"<<endl;
    }
}