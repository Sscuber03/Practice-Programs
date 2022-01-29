#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    string name;
    long number;
    cin >> n;
    map <string,long> pbook;
    for(int i=0;i<n;i++)
    {
        cin >> name;
        cin >> number;
        pbook[name]=number;
    }
    while(cin >> name)
    {
        if(pbook.find(name)!=pbook.end())
        {
            cout << name << "=" << pbook.find(name)->second << endl;
        }
        else 
        {
            cout << "Not found" << endl;
        }
    }
    return 0;
}
