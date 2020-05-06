#include<iostream>
using namespace std;
void count(int *a,int n){
  int f=0,m=0;
  for(int i=0;i<n;i++){
    if(a[i]%2==0)
      f++;
    else
      m++;  
  }
  cout<<m<<"\n"<<f;
}
int main(){
  int n;
  cin>>n;
  int *arr=(int *)malloc(n*sizeof(int));
 	for(int i=0;i<n;i++){
      cin>>arr[i];
    }
                   count(arr,n);
               
  return 0;
}