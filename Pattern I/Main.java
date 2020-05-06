#include<iostream>
using namespace std;
int main(){
 int n,x,y=1;
  cin>>n;
  x=n;
  for(int i=1;i<=8;i++){
   for(int j=1;j<=y;j++){
     cout<<x<<"";
   }
    if(i<4){
      y++;
      x++;
    }
    else if(i==4){
     x=x;
      y=y;
    }
    else{
      y--;
    x--;
  }
    cout<<"\n";
  }
}