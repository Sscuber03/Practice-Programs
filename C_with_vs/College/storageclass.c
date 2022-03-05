#include<stdio.h>
#define PI 3.1415
#define CC 'a'

//anything starting in # is a preprocessor


int main()
{
    // Four storage classes in c
    // auto
    // register 
    // static 
    // extern 

    //auto int n;   same meaning as int n, not used any more
    //register int n;    same meaning as int n, not used any more
    static int n; // initializes as global, with the value 0
    printf("%f\n", PI);
    printf("%c\n", CC);

    return 0;
}