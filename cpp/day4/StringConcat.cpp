#include<iostream>
using namespace std;

void user_strcat(char* s1, char* s2)
{
    while(*s1 != '\0')
    {
        s1++;
    }

    while(*s2 != '\0')
    {
        *s1 = *s2;
        s1++;
        s2++;
    }

    *s1 = '\0';

    
}

int main()
{
    char str1[20];
    char str2[20];

    cout<<"Enter first string"<<endl;
    cin>>str1;

    cout<<"Enter second string"<<endl;
    cin>>str2;

    user_strcat(str1, str2);

    cout<<str1;
}