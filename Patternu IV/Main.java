#include <iostream>
using namespace std;
int main() {
    int n;
  cin>>n;
  int x=1,c1=1,c2=0;
  for(int i=1;i<=n;i++){
      c1=1;
   for(int j=1;j<=n;j++){
     if(i%2==0 && j==1){
      cout<<x+1;
      
     }
     else{
      cout<<x;
     c1++;
     }
     if(c1==n){
      x++;
       c1=0;
     } 
   }
    cout<<"\n";
  }
    return 0;
}