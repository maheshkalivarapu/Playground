#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
  int x=0;
  for(int i=0;i<n;i++){
    if(i%2!=0)
      x=x+i;
      else
      x=x+i+1;
   for(int j=0;j<=i;j++){
       cout<<x;
       if(j!=i)
       cout<<"*";
       if(i%2!=0)
       x--;
       else 
       x++;
   }
   cout<<"\n";
  }
}