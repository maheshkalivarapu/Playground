#include<iostream>
using namespace std;
int main(){
 int n;
 cin>>n;
  int count=0;
  int i=2;
  while(count==0 && i<=n/2){
	if(n%i==0){
      count++;
      break;
    }
    i++;
  }
if(n!=1){
  if(count==0)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}
  else
    cout<<"Not eligible";
}