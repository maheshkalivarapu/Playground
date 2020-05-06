#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int temp=n;
  float s=n;
  while(s>1){
    s= (float)s*(1/sqrt(n));
    temp=temp+s;
    
  }
  cout<<temp;
}