#include<iostream>
using namespace std;
int main()
{
 int pf,df,sf,ps,ds,ss,pa,da,sa;
  cin>>pf>>df>>sf>>ps>>ds>>ss>>pa>>da>>sa;
  int tf= pf-((df/100.0)*pf)+sf;
  int ts= ps-((ds/100.0)*ps)+ss;
  int ta= pa-((da/100.0)*pa)+sa;
  cout<<"In Flipkart Rs."<<tf<<"\nIn Snapdeal Rs."<<ts<<
    "\nIn Amazon Rs."<<ta<<"\nHe will prefer ";
  if(tf<=ts && tf<=ta)
    cout<<"Flipkart";
  else if(ts<=tf && ts<=ta)
    cout<<"Snapdeal";
  else
    cout<<"Amazon";
    
}