#include<iostream>
using namespace std;
struct dis{
 int f;
  float i;
};
int main()
{
  struct dis d1,d2;
  cin>>d1.f>>d1.i>>d2.f>>d2.i;
  if(d1.i+d2.i>12){
   cout<<d1.f+d2.f+1<<"'-"<<d1.i+d2.i-12<<"\""; 
  }
  else
    cout<<d1.f+d2.f<<"'-"<<d1.i+d2.i<<"\"";
}