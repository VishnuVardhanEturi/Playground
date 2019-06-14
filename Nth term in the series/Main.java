#include<stdio.h>
#include<math.h>

int main()
{
  int n;
  int res,tis;
  scanf("%d",&n);
  if(n%2==1)
  {
    tis=(n-1)/2;
    res=2*tis;
    printf("%d",res);
  }
    if(n%2==0)
  {
    tis=n/2;
    res=tis-1;
    printf("%d",res);
  }
  return 0;
}