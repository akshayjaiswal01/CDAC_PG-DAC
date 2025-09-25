#include <iostream>
using namespace std;
#include <string.h>

int main(){
char str[50]= "hello world";
char str1[] = "hello\0 world";
int len=strlen(str);
int size=sizeof(str);
cout<<"legth of string is "<<len<<endl;
cout<<"size of string is "<<size<<endl;
cout<<str<<endl;
cout<<str1<<endl;

}
