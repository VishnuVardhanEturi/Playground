#include<stdio.h>
#include<math.h>
int main()
{
  long int n;
  scanf("%ld",&n);
  int ld,sum=0,i=0;
  while(n>0)
  {
    ld=n%10;
    sum=sum+(ld*pow(2,i));
    i++;
    n=n/10;
  }
  printf("%d",sum);
  return 0;
}