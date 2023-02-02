#include<stdio.h>
#include<conio.h>
int main()
{
    int n,r,c,arm=0;
    printf("enter no.");
    scanf("%d",&n);
    c=n;
    while (n>0)
    {
        r=n%10;
        arm=(r*r*r)+arm;
        n=n/10;
    }
    if (c==arm)
    {
        printf("yes, this is armstrong no.");

    } 
    else {
    printf("No., this is not armstrong no.");
    }
    return 0;

}