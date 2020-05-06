#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int l,gcd;
  cout<<"The treasure is in box which has number ";
  if(a>=b && a>=c){
    if(b>=c){
	cout<<b;
    l=c;
    }
    else{
     cout<<c;
    l=b; 
    }
  }
  else if( c>a && c>b ){
    if(a>=b){
     cout<<a;
  	 l=b; 
    }
    else{
     cout<<b;
  	 l=a; 
    }
  }
  else if(a>=c){
    cout<<a;
  	l=c;
  }
  else{
    cout<<c;
    l=a;
  }
   for(int i=1;i<=l;i++){
      if(a%i==0 && b%i==0 && c%i==0)
      gcd=i;
  }
  cout<<"\nThe code to open the box is "<<gcd;
}