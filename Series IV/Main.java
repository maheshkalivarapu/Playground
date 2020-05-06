#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int x=0;int j;
  for(int i=1;i<=n;i++){
    if(i%2==0)
      j=2;
    else
      j=1;
	cout<<i*i-j<<" ";
    
  }
}