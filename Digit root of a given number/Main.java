#include<iostream>
using namespace std;
int fun(int n){
  int sum=0;
  if(n<=9)
    return n;
  else{
    while(n!=0){
     sum+=n%10;
      n=n/10;
    }
    return fun(sum);
  }
}
int main(){
  int n;
  cin>>n;
  cout<<fun(n);
}