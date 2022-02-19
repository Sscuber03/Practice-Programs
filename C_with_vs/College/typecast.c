#include<stdio.h>

int main(){
    //type casting - conversion of a type to another type
    //TASK - differnce between %d and %i
    int n1, n2;//4bytes
    float ans;//8bytes
    printf("Enter a two numbers: ");
    scanf("%d %d", &n1, &n2);//double - lf
    ans = (float)n1/n2;
    printf("Answer of division= %f",ans);
    return 0;
}