#include <stdio.h>
#include<math.h>
int main() {
	int n;
  int temp,digits=0,sum=0,rem;
      scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    digits++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    rem=temp%10;
    sum=sum+pow(rem,digits);
    temp=temp/10;
  }
  if(sum==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
    return 0;
}