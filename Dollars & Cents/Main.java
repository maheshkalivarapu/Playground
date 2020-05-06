#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  cout<<d1+d2+(c1+c2)/100;
  cout<<"\n"<<(c1+c2)%100;
}