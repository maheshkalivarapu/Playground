#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int e_s=0,o_s=0;
  int flag=0;
  while(n!=0){
	if(flag==0){
     e_s+=(n%10);
      n/=10;
      flag=1;
    }
    else{
	o_s+=(n%10);
      n/=10;
      flag=0;
    }
  }
  if(o_s==e_s)
    cout<<"Yes";
  else
    cout<<"No";
}