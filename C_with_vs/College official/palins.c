#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int pcheck(char *st)
{
    int l, i;
    l=strlen(st);
    for(i=0;i<l/2;i++)
    {
        if(st[i]!=st[l-i-1])
        {
            printf("The sentence is not a palindrome");
            return 0;
        }
    }
    printf("The sentence is a palindrome");
    return 0;
}
int main()
{
    char st[100];
    int i;
    printf("Enter a sentecne to check if palindrome or not: \n");
    scanf("%[^\n]",st);
    pcheck(st);
    return 0;
}