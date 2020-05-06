#include<stdio.h>
int main()
{
    int num, sum=0, count, n;
    scanf("%d", &num);
    for(count=0;sum<num;count++)
    {
        scanf("%d", &n);
        sum=sum+n; 
    }
    printf("The number of turns is %d", count);
    return 0;

}