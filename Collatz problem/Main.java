#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  
  int i=0;
  while(n!=1){
    cout<<n<<'\n';
    if(n%2==0)
    n=n/2;
  else
    n=3*n+1;
    count++;
  }
  cout<<"1\n"<<count;
}