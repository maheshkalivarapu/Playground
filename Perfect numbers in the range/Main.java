#include<iostream>
using namespace std;
int main(){
int m,n;
  int i,sum;
  cin>>m>>n;
 for(i=m;i<=n;i++){
   sum=0;
  for(int j=1;j<i;j++){
   if(i%j==0)
     sum+=j;
  }
   if(sum==i)
     cout<<i<<" ";
 }

}