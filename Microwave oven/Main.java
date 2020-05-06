#include<iostream>
using namespace std;
int main()
{
  int n;
  float item1;
  cin>>n>>item1;
  float t;
  if(n==2)
    cout<<item1 + item1/2;
  else if(n==3)
    cout<<2*item1;
  else
    cout<<"Number of items is more";
  
}