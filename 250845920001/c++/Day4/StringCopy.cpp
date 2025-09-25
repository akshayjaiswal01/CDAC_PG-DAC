#include<iostream>
using namespace std;

void user_strcpy(char* s2, char* s1)
{
    while(*s1 != '\0')
    {
        *s2 = *s1;
        s1++;
        s2++;
    }
    *s2 = '\0';
}

int main()
{
    char str1[20];
    char str2[20];

    cout<< "Enter First String "<<endl;
    cin>>str1;
    cout << "Original String is "<<str1<<endl; 
    user_strcpy(str2, str1);
    cout<<"Copied String is "<<str2<<endl;

}