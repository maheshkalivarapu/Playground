#include<iostream>
using namespace std;
int main()
{
  int units;
  cin>>units;
  cout<<"Rs.";
  if(units<=200){
   
    cout<<int(0.5*units);
  }
  else if(units<=400)
    cout<<int((0.65*units)+100);
  else if(units<=600)
    cout<<(int)(0.8*units)+200;
  else
    cout<<(int)(1.25*units)+425;
}