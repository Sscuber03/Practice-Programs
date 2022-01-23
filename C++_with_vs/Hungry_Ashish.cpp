#include <iostream>

using namespace std;

int main()
{
    int n;
    int a,b,c;
    cin >> n;
    for(int i=0;i<n;i++)
    {
        cin >> a >> b >> c;
        if(a>=b)
        {
            cout << "PIZZA" << endl;
        }
        else if (a>=c)
        {
            cout << "BURGER" << endl;
        }
        else
        {
            cout << "NOTHING" << endl;
        }
    }
}