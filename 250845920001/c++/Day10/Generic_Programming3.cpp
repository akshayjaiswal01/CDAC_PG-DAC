#include<iostream>
using namespace std;

template<class T, int size>
class Array
{
    public:
        T arr[size];

        void insert()
        {
            int j=1;
            for(int i=0; i<size; i++)
            {
                arr[i] = j;
                j++;
            }
            
        }


        void display()
        {
            for(int i=0; i<size; i++)
            {
                cout<<arr[i]<<" ";
            }
        }
};
int main()
{
    Array <int, 5> t1;
    t1.insert();
    t1.display();

}