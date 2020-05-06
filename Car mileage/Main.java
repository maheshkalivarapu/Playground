#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d;
  cin>>m>>p>>d;
  if(p*m>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}