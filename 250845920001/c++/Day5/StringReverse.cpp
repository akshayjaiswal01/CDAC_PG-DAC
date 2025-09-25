#include <iostream>
#include <cstring>
using namespace std;

void reverseString(char* str) 
{
    char *start = str;
    char *end = str + strlen(str) - 1;
    char temp;

    while (start < end) 
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main() 
{
    char str[100];
    cout << "Enter a string: ";
    cin >> str;

    reverseString(str);

    cout << "Reversed string: " << str << endl;
    
}
