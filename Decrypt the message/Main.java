#include<iostream>
using namespace std;
int main(){
int n,t,temp=0;
  cin>>n>>t;
  n=n+t;
  t=n;
  for(int i=1;i<n;i++){
    if(n%i==0)
      temp+=i;
  }
  if(temp==n){
  	if(temp==t)
      cout<<"They can read the message";
    else
      cout<<"They can't read the message";
  }
  else
    cout<<"They can't read the message";
}