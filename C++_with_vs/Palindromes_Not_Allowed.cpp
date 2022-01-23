#include <iostream>
using namespace std;

int main() 
{
	string ss="abcdefghijklmnopqrstuvwxyz";
    string ff="";
    int cc=0;
    int t;
    int n;
    cin >> t;
    for(int i=0;i<t;i++)
    {
        cin >> n;
        for(int j=0;j<n;j++)
        {
            ff+=ss[cc];
            cc++;
            if(cc>25)
            cc-=26;
        }
        cout << ff << endl;
    }
	return 0;
}