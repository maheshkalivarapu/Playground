#include<iostream>
using namespace std;
struct college{
  char name[100];
  char city[100];
  int ey;
  float pp;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  college s[n];
  for(int i=0;i<n;i++){
    cout<<"\nEnter the details of college "<<i+1
      <<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter city";
    cin>>s[i].city;
    cout<<"\nEnter year of establishment";
    cin>>s[i].ey;
    cout<<"\nEnter pass percentage";
    cin>>s[i].pp;
    
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++){
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<s[i].name;
    cout<<"\nCity:"<<s[i].city;
    cout<<"\nYear of establishment:"<<s[i].ey;
    cout<<"\nPass percentage:"<<s[i].pp;
  }
  
}