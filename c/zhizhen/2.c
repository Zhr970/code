#include <stdio.h>


void menu()
{
    printf("\n");
    printf("****************************");
    printf("*****1.add      2.sub*******");
    printf("*****3.mul      4.div*******");
    printf("*****5.exit      ***********");
    printf("****************************");
    printf("****************************");
    printf("\n");

}

int Add(int x,int y)
{
    return x+y;
}
int Sub(int x,int y)
{
    return x-y;
}
int Mul(int x,int y)
{
    return x*y;
}
int Div(int x,int y)
{
    return x/y;
}

int main()
{
    int input=0;
    int x=0;
    int y=0;
    int ret=0;
    int (*pf[5])(int,int)={0,Add,Sub,Mul,Div};

    do
    {
        menu();
        printf("请选择");
        scanf("%d",&input);
        if(input==0)
        {
          printf("退出计算器\n");  
        }
        else if(input>=1 && input<=4)
        {
            printf("请输入两个操作数\n");
            scanf("%d %d",&x,&y);
            ret=pf[input](x,y);
            printf("%d\n",ret);
        }
        else
        {
            printf("输入错误\n");
        }


    } while (input);
    
    return 0;
}