#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age>>time;
  if(age>13){
    if(time==(float)13.30)
      cout<<"$5.00";
  	else
      cout<<"$8.00";
  }
  else{
    if(time==(float)13.30)
      cout<<"$2.00";
  	else
      cout<<"$4.00";
  }
    
}