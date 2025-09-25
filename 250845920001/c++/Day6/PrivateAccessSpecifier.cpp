#include<iostream>
using namespace std;

class Circle
{
        double radius;
        public:
            void setRadius(double radius)
            {
                this->radius = radius;
            }

            double getradius()
            {
                return radius;
            }

            double area()
            {
                return 3.14 * (radius * radius);
            }

};

int main()
{
    Circle c;

    c.setRadius(5.5);

    cout<<"Radius is "<<c.getradius()<<endl;
    cout<<"Area is "<<c.area()<<endl;
}