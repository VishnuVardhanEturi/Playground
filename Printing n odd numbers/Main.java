#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int count=n;
  for(int i=1;i<=count;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
    count++;
    }
  }
	return 0;
}