#include <stdio.h>

// union Un
// {
//     int a;
//     char c;
// };

// int main()
// {
//     union Un u;
//     printf("%lu\n",sizeof(u));//4

//     printf("%p\n",&u);
//     printf("%p\n",&(u.a));
//     printf("%p\n",&(u.c));//共用一个地址

//     return 0;
// }

//判断当前计算机大小端


// int check_sys()
// {
//     int a=1;
//     return *(char*)&a;
// }

// int check_sys()
// {
//     union 
//     {
//         char c;
//         int i;
//     }u;
//     u.i=1;
//     return u.c;

// }
// int main()
// {
//     //int a=1;//0x 00 00 00 01
//     //低--------->高
//     int ret=check_sys();
//     if(ret==1)
//     {
//         printf("小端\n");
//     }
//     else
//     {
//         printf("大端\n");
//     }
// }

//联合的大小至少是最大成员的大小
//当最大成员不是最大对齐数的整数倍的时候，就要对齐到最大对其数的整数倍
union un
{
    short arr[7];//14
    int i;//4
};

int main()
{
    union un u;
    printf("%lu\n",sizeof(u));//16
}