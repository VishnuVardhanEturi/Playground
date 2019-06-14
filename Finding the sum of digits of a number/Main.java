#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int count=0;
  int a;
  while(n>0)
  {
    a=n%10;
    count=count+a;
  	n=n/10;
    a=0;
  }
  printf("%d",count);
	return 0;
}