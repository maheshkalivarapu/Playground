#include<iostream>
#include<string>
using namespace std;
int main()
{
 std::string s1,s2,s3,s4,s5,s6,s7;
  std::cin>>s1>>s2>>s3>>s4>>s5>>s6>>s7;
  string::iterator i,j;
  i=s1.end();
  j=s2.begin();
  if(*(i-1)==*(j))
  {
    std::cout<<s1<<"\n"<<s2<<"\n";
     i=s2.end();
  j=s3.begin();
    if(*(i-1)==*(j))
    {
      std::cout<<s3<<"\n";
       i=s3.end();
  j=s4.begin();
     if(*(i-1)==*(j))
      {
         std::cout<<s4<<"\n";
        i=s4.end();
  j=s5.begin();
        if(*(i-1)==*(j))
        {
           std::cout<<s5<<"\n";
           i=s5.end();
  j=s6.begin();
          if(*(i-1)==*(j))
          {
             std::cout<<s6<<"\n";
             i=s6.end();
  j=s7.begin();
            if(*(i-1)==*(j+1))
            {
               std::cout<<s7<<"\n";
            }
          }
        }
      }
    }
  }
              
}
    