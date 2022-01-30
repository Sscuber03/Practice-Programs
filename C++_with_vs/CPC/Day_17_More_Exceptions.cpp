#include <cmath>
#include <iostream>
#include <exception>
#include <stdexcept>
using namespace std;

//Write your code here

class Calculator
{
    public:
        int power(int n,int p)
        {
            if(n<0 || p<0)
            {
                throw invalid_argument("n and p should be non-negative");
            }
            return pow(n,p);
        }
};

int main()
{
    Calculator myCalculator=Calculator();
    int T,na,pa;
    cin>>T;
    while(T-->0){
      if(scanf("%d %d",&na,&pa)==2){
         try{
               int ans=myCalculator.power(na,pa);
               cout<<ans<<endl; 
         }
         catch(exception& e){
             cout<<e.what()<<endl;
         }
      }
    }
    
}