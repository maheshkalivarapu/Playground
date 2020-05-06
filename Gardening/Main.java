#include<iostream>
using namespace std;
int main()
{
  int rows,columns,tree;
  cin>>rows>>columns>>tree;
  if((tree<=2*rows && tree>rows)||(tree>(columns-2)*rows && tree<=(columns-1)*rows))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}