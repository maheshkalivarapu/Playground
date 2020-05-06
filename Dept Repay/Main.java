#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  cin>>p>>r>>t;
  int i=(float)(p*t*r)/100.0;
  cout<<i<<"\n"<<p+i<<"\n";
  float d=(float)i/50.0;
  cout<<d<<"\n"<<p+i-d;
}