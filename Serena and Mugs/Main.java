#include<iostream>
#include<cstdlib>
using namespace std;
void result(int *a,int n,int v_c){
  int sum=0;
  for(int i=0;i<n;i++){
    sum+=a[i];
  }
  if(sum<=v_c)
    cout<<"YES";
  else
    cout<<"NO";
}
int main()
{
  int n,v_c;
  cin>>n>>v_c;
  int *m=(int *)malloc(n* sizeof(int));
  for(int i=0;i<n;i++){
    cin>>m[i];
  }
  result(m,n,v_c);
}