#include <stdio.h>
#include <math.h>

void test1()
{
    int input=0;
    int sum=0;
    int i=0;
    scanf("%d",&input);
    while(input)
    {
        int bit = input % 10;
        if(bit%2==1)
            bit=1;
        else
            bit=0;
        sum+=bit*pow(10,i++);
        input/=10;
    }
    printf("%d\n",sum);
}

void test2()
{
    int n=0;
    while(scanf("%d",&n)==1)
    {
        int i=0;
        int j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j<n-1)
                    printf(" ");
                else
                    printf("*");
            }
            printf("\n");
        }
    }
}

void test3()
{
    double price=0.0;
    int m=0;
    int n=0;
    int flag=0;
    scanf("%lf %d %d %d",&price,&m,&n,&flag);
    if(m==11 &n==11)
        price=price*0.7-flag*50;
    else if(m==12 && n==12)
        price=price*0.8-flag*50;
    if(price<0.0)
        printf("%.2lf\n",0);
    else
        printf("%.2lf\n",price);
    
}
int main()
{
    //test1();
    //test2();
    //test3();
    
    return 0;
}
