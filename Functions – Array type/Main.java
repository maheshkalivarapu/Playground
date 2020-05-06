#include<iostream>
#include<cstdlib>
using namespace std;
int arr_type(int *arr,int n){
  int e_c=0,o_c=0;
  for(int i=0;i<n;i++){
   if(arr[i]%2==0)
     e_c++;
    else
      o_c++;
  }
  if(e_c==n)
    return 1;
  else if(o_c==n)
    return 2;
  else 
    return 3;
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int *arr=(int*)malloc(n*sizeof(int));
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  int type=arr_type(arr,n);
  switch(type){
    case 1:cout<<"The array is Even";
      break;
    case 2:cout<<"The array is Odd";
      break;
    case 3:cout<<"The array is Mixed";
      break;
  }
}