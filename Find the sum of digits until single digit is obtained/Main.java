#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a,b,sum=0,temp;
  a=n;
  while(a>0)
  {
    temp=a%10;
    sum=sum+temp;
    a=a/10;
  }
  b=sum;
  
  if(sum>10)
  {
    sum=0;
    while(b>0)
    {
      temp=b%10;
      sum=sum+temp;
      b=b/10;
    }
    printf("%d",sum);
  }
  else
  {
  		printf("%d",sum);
  }
  return 0;
}