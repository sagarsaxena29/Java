#include<stdio.h>
#include<conio.h>
int main()
{
    int c,n,r,s=0;
    printf("Enter no. you check: ");
    scanf("%d",&n);
    c=n;
    while(n>0)
    {
    r=n%10;
    s=r+(s*10);
    n=n/10;
    }
    if(c==s)
    printf("yes, this is palandrone no.");
    else
    printf("no., this is not a palandrone no.");
    return 0 ;

}