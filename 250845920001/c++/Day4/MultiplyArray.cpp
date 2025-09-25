#include<iostream>
using namespace std;

int main()
{
    int ar1[3][3];
    int ar2[3][3];

    cout<<"Enter First Matrix"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cin>>ar1[i][j];
        }
    }

    cout<< "Enter Second Matrix"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cin>>ar2[i][j];
        }
    }

    int ar3[3][3];
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            ar3[i][j] = ar1[i][j] * ar2[j][i];
        }
    }

    cout<<"First Matrix is"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cout<<ar1[i][j]<<"\t";
        }
        cout<<endl;
    }

    cout<<"Second Matrix is"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cout<<ar2[i][j]<<"\t";
        }
        cout<<endl;
    }

    cout<<"Multiplication of Matrix is"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cout<<ar3[i][j]<<"\t";
        }
        cout<<endl;
    }

}