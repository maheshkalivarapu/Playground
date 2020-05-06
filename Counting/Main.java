#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string sen;
  getline(cin,sen);
  int vowels=0,consts=0,ws=0,dig=0,sym=0;
  string::iterator i;
  for(i=sen.begin();i<sen.end();i++){
    if(*i=='a' || *i=='A' || *i=='e' || *i=='E' || *i=='i' || *i=='I' || *i=='o' || *i=='O' || *i=='u' || *i=='U')
      vowels++;
    else if((*i>='a' && *i<='z') || (*i>='A' && *i<='Z'))
      consts++;
    else if(*i==' ')
      ws++;
    else if(*i>='0'&& *i<='9')
      dig++;
    else
      sym++;
  }
  cout<<"Vowels:"<<vowels<<endl<<"Consonants:"<<consts<<endl<<"White Spaces:"<<ws<<endl<<"Digits:"<<dig<<endl<<"Symbols:"<<sym<<endl;
}