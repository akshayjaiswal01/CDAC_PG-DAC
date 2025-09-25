#include<iostream>
using namespace std;

class Add
{
    public:
      int a;
      int b;
      int c;

      void input()
      {
        cout<<"Enter a: "<<endl;
        cin>>a;

        cout<<"Enter b: "<<endl;
        cin>>b;
      }

      void add()
      {
        c = a + b;
        cout<<"Addition: "<<c<<endl;
      }

      Add operator+(Add & add)
      {
        Add temp;
    
        temp.a = this->a + add.a;
        temp.b = this->b + add.b;
        temp.c = temp.a + temp.b;
        return temp;
      }
};

int main()
{
    Add add1;
    add1.input();
    add1.add();

    Add add2;
    add2.input();
    add2.add();

    Add add3;
    add3 = add1 + add2;
    cout<<add3.a<<" + "<<add3.b<<" = "<<add3.c<<endl;
}