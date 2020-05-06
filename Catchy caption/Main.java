#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   char ca[100];
  cin.getline(ca,100);
  int i=0,c=0;
  while(ca[i]!='\0'){
   if(ca[i]==' ')
     c++;
    if(c>10){
      cout<<"Caption not eligible for the contest";
     break; 
    }
    i++;
  }
   if(c<=10)
     cout<<"Caption eligible for the contest";
}