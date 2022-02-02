#include <bits/stdc++.h>

using namespace std;

static int cc = 0;

bool chkpal(string ss,int i,int j)
{
    for (; i < j; i++, j--)
        if (ss[i] != ss[j])
            return false;
    return true;
}

int CountPal(string sa)
{
    int n=sa.length();
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (chkpal(sa, i, j))
                cc++;
        }
    }
    return cc;
}

int main()
{
    string s;
    cin >> s;
    cout << CountPal(s) << endl;
    return 0;
}