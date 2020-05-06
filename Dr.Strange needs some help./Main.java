#include<iostream>
using namespace std;
int check(int m,int n,int req){
  int x=1;
  for(int i=1;i<=n;i++){
   x=x*m; 
  }
  if(x>=req)
    return 1;
  else
    return 0;
}
int main(){
 int m,n,req;
  cin>>m>>n>>req;
  int a=check(m,n,req);
  if(a==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}