#include <bits/stdc++.h>

using namespace std;

const int magic_squares_3x3[8][9] = {
    {8, 1, 6, 3, 5, 7, 4, 9, 2},
    {4, 3, 8, 9, 5, 1, 2, 7, 6},
    {2, 9, 4, 7, 5, 3, 6, 1, 8},
    {6, 7, 2, 1, 5, 9, 8, 3, 4},
    {6, 1, 8, 7, 5, 3, 2, 9, 4},
    {8, 3, 4, 1, 5, 9, 6, 7, 2},
    {4, 9, 2, 3, 5, 7, 8, 1, 6},
    {2, 7, 6, 9, 5, 1, 4, 3, 8}
};

int formingMagicSquare(vector<vector<int>> s) 
{
    int ret=100;
    vector<int> v;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            v.push_back(s[i][j]);
        }
    }
    for(int i=0;i<8;i++)
    {
        int cost = 0;
        for(int j=0;j<9;j++)
        {
            cost += abs(v[j] - magic_squares_3x3[i][j]);
        }     
        if(cost < ret)
        {
            ret = cost;
        } 
    }
    return ret;
}

int main()
{

    vector<vector<int>> s(3,vector<int> (3,0));
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            int n = 0;
            cin >> n;
            s[i][j] = n;
        }
    }

    int result = formingMagicSquare(s);
    cout << result << endl;

    return 0;
}