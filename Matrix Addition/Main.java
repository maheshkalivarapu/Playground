#include<iostream>
#include<cstdlib>
using namespace std;
int** createArray(int r,int c);
int addMatrix(int**,int**,int**,int,int);
int getElement(int**,int,int);

int** createArray(int r,int c){
  int**a=(int**)malloc(r*sizeof(int*));
  for(int i=0;i<r;i++)
  a[i]=(int*)malloc(c*sizeof(int));
  return a;
}
int getElement(int**a,int i,int j){
	cin>>a[i][j];
}

int addMatrix(int**a,int**b,int**add,int r,int c){
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++)
      add[i][j]=a[i][j]+b[i][j];
  }

}

int main()
{
    int r,c;
    cin>>r>>c;
  int **a=createArray(r,c);
  int **b=createArray(r,c);
  int **add=createArray(r,c);
   for(int i=0;i<r;i++){
      for(int j=0;j<c;j++)
      getElement(a,i,j);
  }
   for(int i=0;i<r;i++){  
      for(int j=0;j<c;j++)
      getElement(b,i,j);
  }
 
  
  addMatrix(a,b,add,r,c);
  for(int i=0;i<r;i++){
      for(int j=0;j<c;j++)
      cout<<add[i][j]<<" ";
      cout<<"\n";
  }
}





