#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int**arr=(int**)calloc(r,sizeof(int*));
  for(int i=0;i<r;i++)
    arr[i]=(int*)calloc(c,sizeof(int));
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>arr[i][j];
  int sum=0;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++){
      if(i==0||i==r-1)
        sum+=arr[i][j];
      else if(i==j)
        sum+=arr[i][j];
    }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
}