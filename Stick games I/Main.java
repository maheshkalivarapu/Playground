#include<iostream>
using namespace std;
void chk(int n,int m){
  int a[n][m];
 
  int ar=1,ma=0,temp;
  for(int i=0;i<n;i++){
   for(int j=0;j<m;j++){
      temp=ar;
     ar=ma;
     ma=temp;
     n--;
     m--;
     i--;
     break;
   }
  }
  
  if(ar==0)
    cout<<"Arun Gupta";
  else 
    cout<<"Mani Iyer";
}
int main()
{
  int n,m;
  cin>>n>>m;
  chk(n,m);
}