#include<iostream>
using namespace std;
int main(){
int first,second,menu;
  cout<<"Enter first number : ";
  cin>>first;
  cout<<"Enter second number : ";
  cin>>second;
  cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>menu;
  switch(menu){
    case 1:cout<<(first+second);
      break;
    case 2:cout<<(first-second);
      break;
    case 3:cout<<(first*second);
      break;
    case 4:cout<<(first/second);
      break;
    case 5:cout<<(first%second);
      break;
    default:cout<<"Invalid operation";
  }
}