#include <iostream>
#include <conio.h>
#include <math.h>

using namespace std;

int main()
{
    int a,b,c;
    cout << "Enter three sides of the triangle" << endl;
    cin >> a >> b >> c;
    if(a+b>c && b+c>a && c+a>b)
    {
        cout <<"The triangle is possible" << endl;
        if(a==b && b==c)
        {
            cout <<"The triangle is Equilateral" << endl;
        }
        else if(a==b || b==c || c==a)
        {
            cout <<"The triangle is Isoceles" << endl;
        }
        else
        {
            cout <<"The triangle is Scalene" << endl;
        }
    }
    else
    {
        cout <<"The triangle is not possible" << endl;
    }
}