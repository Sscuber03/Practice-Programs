#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
    int a,b;
    cout << "Enter the first number" << endl;
    cin >> a;
    cout << "Enter the second number" << endl;
    cin >> b;
    int c;
    c=a;
    a=b;
    b=c;
    cout << "First number is " << a << endl;
    cout << "First number is " << b << endl;
}