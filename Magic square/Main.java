#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int**arr=(int**)calloc(n,sizeof(int*));
  for(int i=0;i<n;i++)
    arr[i]=(int*)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>arr[i][j];
  int sum1=0,sum2=0;
   for(int i=0;i<n;i++)
    for(int j=0;j<n;j++){
      if(i==j)
        sum1+=arr[i][j];
      if(i+j==n-1)
        sum2+=arr[i][j];
    }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
  
}