#include<iostream>
using namespace std;
int main()
{
  int b,p;
  cin>>b>>p;
  if(p<b)
    p+=100;
  cout<<p-b;
  
}