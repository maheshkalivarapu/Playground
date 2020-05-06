#include<iostream>
#include<cstring>
using namespace std;
struct employee{
char name[30]; 
  int id;
  int age;
  char desig[30];
  int sal;
};
int main()
{
 employee emp;
    cout<<"Enter name:";
    cin>>emp.name;
    cout<<"\nEnter ID:";
    cin>>emp.id;
    cout<<"\nEnter age:";
    cin>>emp.age;
    cout<<"\nEnter designation:";
    cin>>emp.desig;
  cout<<"\nEnter Salary:";
  cin>>emp.sal;
 
  cout<<"\nEmployee Details";
    cout<<"\nName of the Employee : "<<emp.name;
    cout<<"\nID of the Employee : "<<emp.id;
    cout<<"\nAge of the Employee : "<<emp.age;
    cout<<"\nDesignation of the Employee : "<<emp.desig;
  	cout<<"\nSalary of the Employee : "<<emp.sal;
}