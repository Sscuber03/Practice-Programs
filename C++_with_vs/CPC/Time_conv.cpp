#include <bits/stdc++.h>
#include<sstream>

using namespace std;

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string timeConversion(string s) {
    
    int hr;
    string r;
    hr = ((s[0]-'0')*10)+((s[1])-'0');
    if(s[8]=='P' && hr == 12)
    {
        r+=to_string(hr);
    }
    else if(s[8]=='P')
    {
        int hh=hr+12;
        r+=to_string(hh);
    }
    else if(s[8]=='A' && hr == 12)
    {
        string h="00";
        r+=h;
    }
    else if(s[8]=='A')
    {
        if(hr<10)
        {
            r+="0";
        }
        r+=to_string(hr);
    }
    for(int i =2;i<8;i++)
    {
        r=r+s[i];
    }
    return r;

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}