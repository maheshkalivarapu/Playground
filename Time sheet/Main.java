#include<iostream>
using namespace std;
int main()
{
  int su,m,t,w,th,f,st;
  cin>>su>>m>>t>>w>>th>>f>>st;
  int tt,sal=0;
  tt=su+m+t+w+th+f+st;
  if (su!=0 || st!=0)
    sal=(int)((100*su)*3/2.0)+(100*st)*5/4.0+sal;
  else if(tt>40 && su!=0 && st!=0)
    sal=(40-tt)*25;
  if(m>8)
    sal=sal+(m-8)*15 +m*100;
  else
    sal=sal+(m*100);
  if(t>8)
    sal=sal+(t-8)*15 +t*100;
  else
    sal=sal+(t*100);
  if(w>8)
    sal=sal+(w-8)*15 +w*100;
  else
    sal=sal+(w*100);
  if(th>8)
    sal=sal+(th-8)*15 +th*100;
  else
    sal=sal+(th*100);
  if(f>8)
    sal=sal+(f-8)*15 +f*100;
  else
    sal=sal+(f*100);
  
  cout<<sal;
  
}