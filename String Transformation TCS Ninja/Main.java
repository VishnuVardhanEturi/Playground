#include<stdio.h>
int main()
{
  char s1[50],s2[50],s3[50];
  scanf("%s%s%s",s1,s2,s3);
  int i;
  for(i=0;s1[i]!='\0';i++)
  {
    char ch=s1[i];
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      s1[i]='$';
  }
  for(i=0;s2[i]!='\0';i++)
  {
    char ch=s2[i];
    if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
      s2[i]='#';
  }
  for(i=0;s3[i]!='\0';i++)
  {
    char ch=s3[i];
    if(ch>='a'&&ch<='z')
      s3[i]=ch-32;
  }
  printf("%s%s%s",s1,s2,s3);
  return 0;
}