#include<iostream>
using namespace std;

int main()
{
    int ar1[3][3];

    cout<<"Enter elements of array"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cin>>ar1[i][j];
        }
    }

    int ar2[3][3];
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            ar2[i][j] = ar1[j][i];
        }
    }

    cout<<"Original Matrix is"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cout<<ar1[i][j]<<"\t";
        }
        cout<<endl;
    }

    cout<<"Transpose of Matrix is"<<endl;
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            cout<<ar2[i][j]<<"\t";
        }
        cout<<endl;
    }
}