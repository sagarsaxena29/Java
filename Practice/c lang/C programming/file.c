#include<stdio.h>
#include<conio.h>
int main()
{
int arr[10];
int size,i,pos,item;
printf("Enter size of Array");
scanf("%d",&size);
printf("Enter elements of Array");
for(i=0;i<size;i++)
{
scanf("%d",&arr[i]);
}
printf("Where fo you want enter element\n");
scanf("%d",&pos);
printf("Enter Item\n");
scanf("%d",&item);
for(i=size;i>=pos;i--)
{
arr[i]=arr[i-1];
}
arr[pos]=item;
size++;
printf("Array elements: \n");
for(i=0;i<size;i++)
{
printf("%d\n",arr[i]);
}
return 0;
}