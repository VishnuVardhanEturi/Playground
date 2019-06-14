#include<stdio.h>
int main()
{
  int n;
  int sum=0,prime=1;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    for(int j=2;j<=i/2;j++)
    {
      if(i%j==0)
      {
        prime=0;
        break;
      }
    }
    if(prime==1)
      sum=sum+i;
    prime=1;
  }
  printf("%d",sum);
  return 0;
}