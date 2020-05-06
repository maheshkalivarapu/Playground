#include<iostream>
using namespace std;
int main()
{
  int n,count=0;float score;
  int flag;
  while(flag){
    cin>>n;
    if(n>0){
      if(n%2==1){
       score+=1;
       count++;
      }
      else
       score-=0.5;
      }
    else{
      score-=1;
      flag=0;
    }
    if(count==3)
      flag=0;
  }
  cout<<score;
      
}