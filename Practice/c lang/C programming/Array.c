#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],i,n,pos,data;
    printf("Enter length of array");
    scanf("%d",&n);
    printf("Enter Elements of array: ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter position: ");
    scanf("%d",&pos);
    printf("Enter Data: ");
    scanf("%d",&data);
for (i = n - 1; i >= pos; i--)
		a[i] = a[i - 1];

 	a[pos - 1] =data;

 
	for (i = 0; i < n; i++)
		printf("%d ", a[i]);
	printf("\n");

	return 0;
}
