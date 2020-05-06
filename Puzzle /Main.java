#include<iostream>
using namespace std;
int main()
{
   int r,c;
  cin>>r>>c;
  int a_t[c][r];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
     cin>>a_t[j][i]; 
    }
  }
  for(int i=0;i<c;i++){
    for(int j=0;j<r;j++){
     cout<<a_t[i][j]<<" "; 
    }
    cout<<"\n";
  }
}