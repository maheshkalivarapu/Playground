#include<iostream>
#include<iomanip>
#include<stdio.h>
using namespace std;
int main()
{
  int balls,x,y,n;
  cin>>balls>>x>>y>>n;
  cout<<balls/6<<"\n";
  cout<<n/6<<"."<<n%6<<"\n";
  int temp=n/6;
  float temp2=(n%6)/10.0;
  float overs=(float)temp+temp2;
  float crr=y/overs;
  printf("%.1f\n",crr);
  float trr=(float)x/(balls/6);
    printf("%.1f\n",trr);
  if(crr>=trr)
  cout<<"Eligible to Win";
  else
  cout<<"Not Eligible to Win";
  
  

  
}