#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str)
{
	// Complete this function

    stringstream ss(str);
    vector<int> itt;
    char ch;
    int t;
    while(ss >> t)
    {
        itt.push_back(t);
        ss >> ch;
    }
    return itt;
}

int main() 
{
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}