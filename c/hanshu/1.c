#include <stdio.h>

//写一个计算器
//加法，减法，乘法，除法
//回调函数

void menu()
{
    printf("****************************");
    printf("*****1.add      2.sub*******");
    printf("*****3.mul      4.div*******");
    printf("*****5.exit      ***********");
    printf("****************************");
    printf("****************************");

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

void calc(int (*pf)(int ,int))
{
    int x=0;
    int y=0;
    int ret =0;
    printf("请输入两个操作数");
    scanf("%d %d",&x,&y);
    ret=pf(x,y);
    printf("%d\n",ret);
}

int main()
{
    int input=0;
    

    do
    {
        printf("请选择");
        scanf("%d",&input);
        
        switch(input)
        {
            case 1:
                calc(Add);
                break;
            case 2:
                calc(Sub);
                break;
            case 3:
                calc(Mul);
                break;
            case 4:
                calc(Div);
                break;
            case 0:
                printf("退出\n");
                break;
            default:
                printf("选择错误");
                break;

        }
    }while(input);

    return 0;
}