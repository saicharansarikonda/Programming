using namespace std;
#include<iostream>
int main()
{
    int n;
    cin>>n;
    int arr[n-1];
    for(int i=0;i<n-1;i++){
        cin>>arr[i];
    }
    int a=1;
    int b=arr[0];
    for(int i=2;i<=n;i++)
    {
        a^=i;
    }
    for(int i=1;i<n-1;i++)
    {
        b^=arr[i];
    }
    cout<<(a^b)<<endl;
}
