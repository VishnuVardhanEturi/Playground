#include<stdio.h>
int main()
{
  int n,ld,fd;
  scanf("%d",&n);
  ld=n%10;
  fd=(n/10)/10;
  printf("%d",fd+ld);
  return 0;
}