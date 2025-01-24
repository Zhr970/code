#include <stdio.h>

void one()
{
    int a[5]={1,2,3,4,5};
    int *ptr=(int*)(&a+1);
    printf("%d,%d\n",*(a+1),*(ptr-1));//2,5
}

struct Test
{
    int Num;
    char* pcNAme;
    short sDate;
    char cha[2];
    short sBa[4];
}*p;
//假设p的值为0x100000，如下表达式的值分别为多少
//已知，结构体Test类型的变量大小是20个字节
//x86环境

void two()
{
    printf("%p\n",p+0x1);//0x100014   0x100000跳过一个结构体 加上20个字节
    printf("%p\n",(unsigned long)p +0x1);//0x100000 -> 1,048,576+1 ->1,048,577 ->0x100001
    printf("%p\n",(unsigned int*)p +0x1);//0x100000+4 -> 0x100004
}

void three()
{
    int a[4]={1,2,3,4};
    int *ptr1=(int*)(&a+1);
    int *ptr2=(int*)((int)a+1);
    printf("%x,%x\n",ptr1[-1],*ptr2);//4,2000000
}

void four()
{
    int a[3][2]={(0,1),(2,3),(4,5)};
    int *p;
    p=a[0];
    printf("%d\n",p[0]);//1 逗号表达式
}

void five()
{
    int a[5][5];
    int(*p)[4];
    p=a;
    printf("%p,%d\n", &p[4][2]-&a[4][2],&p[4][2]-&a[4][2]);//FFFFFFFC,-4
}

void six()
{
    int aa[2][5]={1,2,3,4,5,6,7,8,9,10};
    int *ptr1=(int*)(&aa+1);
    int *ptr2=(int*)(*(aa+1));
    printf("%d,%d\n",*(ptr1-1),*(ptr2-1));//10,5
}

void seven()
{
    char *a[]={"work","at","alibaba"};
    char **pa=a;
    pa++;
    printf("%s\n",*pa);//at
}

void eight()
{
    char* c[]={"ENTER","NEW","POINT","FIRST"};
    char** cp[]={c+3,c+2,c+1,c};
    char*** cpp=cp;
    printf("%s\n",**++cpp);//POINT
    printf("%s\n",*-- * ++cpp +3);//ER
    printf("%s\n",*cpp[-2]+3);//ST
    printf("%s\n",cpp[-1][-1]+1);//EW
}

int main()
{
    one();
    two();
    three();
    four();
    five();
    six();
    seven();
    eight();
    return 0;
}
