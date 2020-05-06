#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int**arr=(int**)malloc(r*sizeof(int*));
  for(int i=0;i<r;i++)
    arr[i]=(int*)malloc(c*sizeof(int));
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>arr[i][j];
  int max=arr[0][0];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      if(arr[i][j]>max)
        max=arr[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}