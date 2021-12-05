#include <iostream>
#include <conio.h>
#include <string.h>
#include <ctype.h>
#include <stdio.h>

using namespace std;

int main()
{
    char a[100];
    int b=0,c=0,d=0,f=0,g=0,h=0,dg=0;
    cout << "Enter a string" << endl;
    gets (a);
    b=strlen(a);
    for(c=0;c<b;c++)
    {
        if(a[c]==' ')
        d++;
        if(a[c]=='a' || a[c]=='e' || a[c]=='i' || a[c]=='o' || a[c]=='u' || a[c]=='A' || a[c]=='E' || a[c]=='I' || a[c]=='O' || a[c]=='U')
        f++;
        if(isupper(a[c]))
        g++;
        if(islower(a[c]))
        h++;
        if(isdigit(a[c]))
        dg++;
    }
    cout << "Length of the sentence inputed - " << b << endl;
    cout << "Number of words - " << (d+1) << endl;
    cout << "Number of spaces - " << d << endl;
    cout << "Number of consonants - " << (b-(d+f+dg)) << endl;
    cout << "Number of uppercase - " << g << endl;
    cout << "Number of lowercase - " << h << endl;
    cout << "Number of digits - " << dg << endl;
    cout << "Number of vowels - " << f << endl;
}