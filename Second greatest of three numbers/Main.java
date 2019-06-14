#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if((a>b&&a<c)||(a>c&&a<b))
  {
        printf("second greatest = %d",a);
  }
   else if((b>a&&b<c)||(b>c&&b<a))
  {
        printf("second greatest = %d",b);
  }
  else
  {
        printf("second greatest = %d",c);
  }
  return 0;
}
