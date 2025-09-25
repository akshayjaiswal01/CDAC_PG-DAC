#include <iostream>
#include <fstream>
using namespace std;
int main() 
{

    fstream my_file("example.txt", ios::out);
    if (my_file) {
        my_file << "This is a test line." << endl;
        my_file.close();
    }
    else {
        cout << "Unable to open file for writing." << endl;
        return 1;
    }

    string line;
    my_file.open("example.txt", ios::in);

    
    if (my_file) {
        while (!my_file.eof()) {
            getline(my_file, line);
            cout << "Read from file: " << line << endl;
        }
        my_file.close();
    }
    else {
        cout << "Unable to open file for reading." << endl;
        return 1;
    }

    my_file.open("example.txt", ios::app);


    if (my_file) {
        my_file << "This is another test line, appended to the file." << endl;
        my_file.close();
    }
    else {
        cout << "Unable to open file for appending." << endl;
        return 1;
    }

    return 0;
}