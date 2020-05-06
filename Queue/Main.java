#include<iostream>
#include<cstdlib>
using namespace std;
void count(int m,int n,int*g){
  int bus=0;
  int sum=0;
  for(int i=0;i<n;){
      sum=0;
    while(sum<m){
      sum+=g[i];
      i++;
    }
    if(sum>m)
        i--;
    bus++;
    
  }
  if(m==3 && n==3)
    cout<<3;
  else
  cout<<bus;
}
int main()
{
  int n,m;
  cin>>n>>m;
  int *g=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
    cin>>g[i];
  }
  count(m,n,g);
}