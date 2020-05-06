#include<iostream>
#include<cstdlib>
using namespace std;
void insert(int* arr,int n,int l,int val){
  int i;
  n++;
  for(i=n-2;i>=l-1;i--){
    arr[i+1]=arr[i];
  }
  arr[l-1]=val;
  for(i=0;i<n;i++)
    cout<<arr[i]<<"\n";
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int *arr=(int*)malloc(n*sizeof(int));
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  int l;
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>l;
   if(l>n)
    cout<<"\nInvalid Input";
  else
  {
  int val;
  cout<<"\nEnter the value to insert";
  cin>>val;
  cout<<"\nArray after insertion is\n";
  insert(arr,n,l,val);
  }
  
}