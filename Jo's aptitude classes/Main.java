#include<iostream>
using namespace std;
int GCD(int a,int b){
  if(a==0)
    return b;
    return GCD(b%a,a);
}
int main(){
  int n1,n2,n3,ans;
  int gcd;
  cin>>n1>>n2>>n3>>ans;
  gcd=GCD(GCD(n1,n2),n3);
  if(gcd==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}