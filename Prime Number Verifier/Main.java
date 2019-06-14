// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  scanf("%d",&n);
  int count=0;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      count++;
  }
  if(count>2)
    printf("composite");
  else if(count==2)
    printf("prime");
  else
    printf("neither");
   return 0;
}