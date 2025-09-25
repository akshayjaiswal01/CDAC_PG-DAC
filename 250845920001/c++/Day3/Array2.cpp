#include<iostream>
using namespace std;

int main()
{
    int a[3][3];

    // using subscript notation
    // cout << "Enter Elements of Array "<< endl;
    // for(int i=0; i<=2; i++)
    // {
    //     for(int j=0; j<=2; j++)
    //     {
    //         cin >> a[i][j];
    //     }
    // }

    // cout << "Elements of Array is "<<endl;
    // for(int i=0; i<=2; i++)
    // {
    //     for(int j=0; j<=2; j++)
    //     {
    //         cout << a[i][j] <<"\t";
    //     }
    //     cout << endl;
    // }


    // using pointer notation 
    cout << "Enter Elements of Array "<< endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cin >> *(*(a+i)+j);
        }
    }

    cout << "Elements of Array is "<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cout << *(*(a+i)+j) <<"\t";
        }
        cout << endl;
    }

}