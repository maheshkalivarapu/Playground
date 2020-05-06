#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
  int x=0,y=0;
  for(int i=1;i<=2*n;i++){
    if(i<=n){
     x++;
    }
    else
      x--;
   for(int j=1;j<=x;j++){
     cout<<x;
     if(j!=x)
       cout<<"*";
   }
    if(i==n)
      x++;
    cout<<"\n";
  }
}