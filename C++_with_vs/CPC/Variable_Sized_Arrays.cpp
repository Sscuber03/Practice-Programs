#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() 
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   

    int n,q;
    cin >> n >> q;
    int** ov = new int*[n];
    for(int i=0;i<n;i++)
    {
        int l;
        cin >> l;
        ov[i]= new int[l];
        for(int j=0;j<l;j++)
        {
            cin >> ov[i][j];
        }
    }
    for(int i=0;i<q;i++)
    {
        int fi,se;
        cin >> fi >> se;
        cout << ov[fi][se] << endl;
    }

    return 0;
}