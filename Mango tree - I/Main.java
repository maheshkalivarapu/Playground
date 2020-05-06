#include<iostream>
using namespace std;
int main()
{
  int rows,columns,tree;
  cin>>rows>>columns>>tree;
  if(tree<=columns || tree%columns==1 || tree%columns==0)
    cout<<"Yes";
  else
    cout<<"No";
}