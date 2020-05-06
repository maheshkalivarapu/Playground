#include<iostream>
using namespace std;
int main()
{
 char enter[10];
  int rail;
 cin>>enter>>rail;
  char x='front';
    if(enter[2]=='o')
  {
      if(rail==1)
    std::cout<<"Left Handed";

  else 
    std::cout<<"Right Handed";
  }
  else
  {
    if(rail==1)
      std::cout<<"Right Handed";
  else
    std::cout<<"Left Handed";
  }
}