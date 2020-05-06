
#include <iostream>
using namespace std;
int main(){
int n,m,z,x=1;
cin>>n;
m=n;
int y=2*n;
int t=n*(n+1)+1;
z=t;
    for(int i=0;i<n;i++){
        z=t-m+i;
        for(int j=0;j<y;j++){
            if(j<i)
                cout<<"--";
            else if(j>=i && j<=n-1){
                cout<<x++;
                if(j!=y-1)
                    cout<<"*";
            }
            else{
                cout<<z++;
                if(j!=y-1)
                    cout<<"*";
                m++;
            }
            
        }
        cout<<"\n";
        y--;
        
    }

    return 0;
}
