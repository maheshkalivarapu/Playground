#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int x=11;
  for(int i=1;i<=n;i++){
	cout<<x*x<<" ";
    x=x+4;
  }
}