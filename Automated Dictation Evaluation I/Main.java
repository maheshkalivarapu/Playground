#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string str1;
  getline(cin,str1);
  string str2;
  getline(cin,str2);
  if(str1.size()!=str2.size())
    cout<<"It is wrong";
  else{
      string::iterator i,j;
    for( i=str1.begin(), j=str2.begin();i<str1.end();i++,j++){
      if(*i!=*j)
        break;
    }
     if(i==str1.end())
    cout<<"It is correct";
    else
      cout<<"It is wrong";
  }
 
}