#include<iostream>
using namespace std;
int main()
{
  int max,a,c;
  cin>>max>>a>>c;
  int t=a*75+c*30;
  if(t<max)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}