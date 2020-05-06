#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
  int x=6;
  for(int i=1,j=0;i<=n;i++,j++){
    cout<<x+5*j<<" ";
    x=x+5*j;
  }
}