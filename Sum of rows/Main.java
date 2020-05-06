
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
  int row_sum=0;
  for(int i=0;i<r;i++){
    row_sum=0;
    for(int j=0;j<c;j++){
      row_sum+=arr[i][j];      
    }
    cout<<row_sum<<"\n";
  }
  
  
}