#include<iostream>
using namespace std;
struct time{
  int h;
  int m;
  int s;
};
int main()
{
  struct time t1,t2;
  cin>>t1.h>>t1.m>>t1.s>>t2.h>>t2.m>>t2.s;
  if(t1.s<t2.s){
   t1.m--;
    t1.s+=60;
  }
  if(t1.m<t2.m){
    t1.h--;
    t1.m+=60;
  }
  cout<<t1.h-t2.h<<":"<<t1.m-t2.m<<":"<<t1.s-t2.s;
}