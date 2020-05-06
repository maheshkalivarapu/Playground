#include<iostream>
using namespace std;
int main()
{
 int n,temp,s;
  cin>>n;
  temp=n;
  int d_c=0,div=1;
  while(temp!=0){
	temp/=10;
    d_c++;
    div*=10;
  }
  temp=n*n;
  if((temp%div + temp/div)==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}