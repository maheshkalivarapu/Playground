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
  
  int*max=(int*)calloc(r,sizeof(int));
  
   for(int i=0;i<r;i++){
     max[i]=arr[i][0];
    for(int j=0;j<c;j++){
      if(max[i]<arr[i][j])
        max[i]=arr[i][j];
    }
   }
  for(int i=0;i<r;i++)
    cout<<max[i]<<"\n";
  
  
}