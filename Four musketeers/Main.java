#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;float p,q;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  p=(float)(x1+x2+x3)/3;
  q=(float)(y1+y2+y3)/3;
  cout<<p<<"\n"<<q;
}