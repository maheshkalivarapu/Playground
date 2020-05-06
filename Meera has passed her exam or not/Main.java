#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n],ht;
  for(int i=0;i<n;i++){
   cin>>a[i]; 
  }
  cin>>ht;
  int j;
  for( j=0;j<n;j++){
   if(a[j]==ht){
     cout<<"She passed her exam";
     break;
   }
  }
  if(j==n)
    cout<<"She failed";
}