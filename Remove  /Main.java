#include<iostream>
using namespace std;
int main()
{
  string str,x="the";
  getline(cin,str);
  while(str.find(x)!=string::npos){
    str.erase(str.find(x),4);
  }
  cout<<str<<endl;
}