#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,e_s=0,o_s=0;
  cin>>n;
  int *a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0)
      e_s+=a[i];
      else
        o_s+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e_s;
  cout<<"\nThe sum of the odd numbers in the array is "<<o_s;
}