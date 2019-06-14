#include<stdio.h>
int main()
{
  int n;
  int fib;
  scanf("%d",&n);
  int a=1,b=2;
  for(int i=3;i<=n;i++)
  {
    fib=a+b;
    a=b;
    b=fib;
  }
  printf("%d",fib);
  return 0;
}