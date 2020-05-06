#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  for(string::iterator i=str.begin();i<str.end();i++){
    if(!((*i>='A' && *i<='Z') || (*i>='a'&& *i<='z'))){
      str.erase(i);
      i--;
    }
  }
  cout<<str;
}