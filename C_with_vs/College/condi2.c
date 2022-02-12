#include<stdio.h>

int main()
{
    int a=80;
    if(a>100)
    {
        printf("a is greater than 100\n");
    }
    else if(a>95 && a<100)//and operation(&&), if all of them are true,then it will execute the statement
    {
        printf("95<a<100\n");
    }
    else if(a>90 || a>95)//or operation(||),if any one of the condition is true, then it will execute the statement
    {
        printf("90\n");
    }
    else if(!(a>90))//not operation(!),if the condition is true, it returns false, and vice versa.
    {
        printf("a is less than 90\n");
    }
    else
    {
        printf("Nothing to see here!!\n");
    }
    return 0;
}