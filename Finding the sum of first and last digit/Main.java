#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int m;
  int i=0,a=0;
  m=n;
  while(m>0)
  {
    i=m%10;
    m=0;
  }
  while(n>10)
  {
    
    n=n/10;
    a=n%10;
  }
  printf("%d",i+a);
	return 0;
}