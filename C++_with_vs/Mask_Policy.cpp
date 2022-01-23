#include <iostream>
using namespace std;

int main() 
{
	int n;
    int a,b;
    int c;
    int min;
    cin >> n;
    for(int i=0;i<n;i++)
    {
        cin >> a >> b;
        c=a-b;
        if(c<b)
        min=c;
        else
        min=b;
        cout << min << endl;
    }
	return 0;
}