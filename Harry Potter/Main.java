#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int f,l;
  f=num%10;
  num=num/1000;
  l=num%10;
  cout<<f+l;
}