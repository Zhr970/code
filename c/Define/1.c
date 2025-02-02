#include <stdio.h>

// #define SQUARE1(X) X*X

// #define SQUARE2(X) (X)*(X)

// int main()
// {
//     int r=SQUARE1(5);//25
//     int r1=SQUARE1(5+1);//11
//     int r2=SQUARE2(5+1);//36
//     return 0;
// }

// #define PRINT(N) printf("the value of "#N" is %d\n",N)
// #define PRINTF(N,FORMAT) printf("the value of "#N" is "FORMAT"\n",N)
// int main()
// {
//     int a=10;
//     PRINT(a);//""a"""="#a"
//     int b=20;
//     PRINT(b);
//     float c=10.0;
//     PRINTF(a,"%d");
//     PRINTF(c,"%lf");
//     return 0;
// }


// #define MAX(x,y) ((x)>(y)?(x):(y))
// int main()
// {
//     int a=5;
//     int b=4;
//     int m=MAX(a,b);
//     printf("%d\n",m);//5

//     int M=MAX(a++,b++);
//     printf("%d %d %d\n",M,a,b);//5 7 5
//     return 0;
// }

// #include <stdlib.h>
// #define MALLOC(num,type) (type*)malloc((num)*sizeof(type))
// int main()
// {
//     //malloc(40);
//     //malloc(10,int);
//     int* p=MALLOC(10,int);
//     //int* p=(int*)malloc((10)*sizeof(int));
//     return 0;
// }

//unfine (name) 删除宏


//条件编译
// int main()
// {
// #if 1//__DEBUG__ 1为真 编译 0为假 不编译 
//     printf("hehe\n");
// #endif//__DEBUG__

//     return 0;
// }

// #define M 9
// int main()
// {
// #if M>5
//     printf("he\n");
// #elif M==5
//     printf("hehe\n");
// #else
//     printf("hehehe\n");
// #endif

//     return 0;
// }

// int main()
// {
// #if defined(MAX)//定义后编译 #if !defined(MAX) 不定义就编译
// //#ifdef
//     printf("max\n");
// #endif
//     return 0;
// }

//#pragma once 作用：防止头文件别多次重复的包含
//#include <stdio.h>
//#include "stdio.h"
//<>和"""的区别
//<>查找策略：直接去库目录下查找
//""查找策略：1先去代码所在路径下查找；2如果上面找不到，再去库目录下查找


//offsetof宏的实现

#include <stddef.h>

struct S
{
    char c1;
    int i;
    char c2;
};

#define OFFSETOF(type,m_name) (size_t)&(((type*)0)->m_name)
int main()
{
    struct S s={0};
    printf("%lu\n",offsetof(struct S,c1));//0
    printf("%lu\n",offsetof(struct S,i));//4
    printf("%lu\n",offsetof(struct S,c2));//8 起始地址的偏移量
    printf("\n");
    printf("%lu\n",OFFSETOF(struct S,c1));//0
    printf("%lu\n",OFFSETOF(struct S,i));//4
    printf("%lu\n",OFFSETOF(struct S,c2));//8
    return 0;
}
