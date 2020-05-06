#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string org,rev;
  getline(cin,org);
  getline(cin,rev);
  string::reverse_iterator i;
  string::iterator j;
  for( i=org.rbegin(),j=rev.begin();i<org.rend();i++,j++){
    if(*i==*j)
      continue;
  else
    break;
  }
  if(i==org.rend())
  cout<<"It is correct";
else
  cout<<"It is wrong";
}
