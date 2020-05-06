#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];    
  cin.getline(str,100);
int count = 0, end, i;    
  while(str[count]!='\0')
    count++;
  for(int j=0,i=count-1;i>=0;i--,j++){
    rev[j]=str[i];
  }
std::cout<<rev;
}