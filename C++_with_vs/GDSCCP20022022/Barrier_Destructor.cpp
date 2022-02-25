#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin >> n;
    int ar[n];
    for(int i=0;i<n;i++)
    {
        cin >> ar[i];
    }
    unordered_map<int,int> f;
    for(int i=0;i<n;i++)
    {
        f[ar[i]]++;
    }
    int m_f=0;
    for(auto i=f.begin();i!=f.end();i++)
    {
        m_f = max(m_f,i->second);
    }
    cout << n-m_f << endl;
    return 0;
}