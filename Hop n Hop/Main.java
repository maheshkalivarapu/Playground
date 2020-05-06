#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x2,y2;
  cin>>x2>>y2;
  float x=((x2-3)*(x2-3)+(y2-4)*(y2-4));
  int d=(int)sqrt(x);
  cout<<d;
  
}