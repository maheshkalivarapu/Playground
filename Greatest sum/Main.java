
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
  int*row_sum=(int*)calloc(r,sizeof(int));
  int*col_sum=(int*)calloc(c,sizeof(int));
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      row_sum[i]+=arr[i][j];      
    }
  }
  
  for(int i=0;i<c;i++){
    for(int j=0;j<r;j++){
      col_sum[i]+=arr[j][i];      
    }
  }
 cout<<"Sum of rows is ";
  int row_sum_max=row_sum[0],R=0;
  int col_sum_max=col_sum[0],C=0;
	for(int i=0;i<r;i++){
		cout<<row_sum[i]<<" ";
      if(row_sum_max<row_sum[i]){
        row_sum_max=row_sum[i];
        R=i;
      }
    }
  cout<<"\nRow "<<R+1<<" has maximum sum\n";
  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
		cout<<col_sum[i]<<" ";
      if(col_sum_max<col_sum[i]){
        col_sum_max=col_sum[i];
        C=i;
      }
    }
  cout<<"\nColumn "<<C+1<<" has maximum sum";
}