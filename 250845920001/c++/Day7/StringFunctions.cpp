#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    string str = "Hello";
    cout << str.length()<<endl; 

    string st5 = "";
    if (str.empty()) 
    cout << "String is empty!"<<endl;

    str.clear(); 

    string str1 = "Hello";
    str.append(" World");
    cout<<str1<<endl;

    str1.clear(); 

    string str2 = "Hello";
    str.insert(5, " World"); 
    cout<<str2<<endl;

    char ch = str2.at(1); 
    cout<<ch<<endl;

    char ch1 = str[1]; 
    cout<<ch1<<endl;

    string str3 = "Hello";
    string str4 = "World";
    int result = str3.compare(str4); 
    cout<<result<<endl;



}