#include<iostream>
using namespace std;
struct com{
  int a;
  int b;
  void get(){
   cin>>a>>b;
  }
};
int main(){
  int i;
  cin>>i;
 com p,q,o;
  p.get();
  q.get();
  switch(i){
    case 1: {o.a=p.a+q.a;
             o.b=p.b+q.b;}
      break;
    case 2: {o.a=p.a-q.a;
             o.b=p.b-q.b;}
      break;
    case 3: {o.a=p.a*q.a-p.b*q.b;
             o.b=p.a*q.b+p.b*q.a;}
      break;
    default:{
      cout<<"Invalid choice";
      return 0;}
  }
  cout<<o.a;
  if(o.b>0)
    cout<<'+'<<o.b<<'i';
  else
    cout<<o.b<<'i';
}