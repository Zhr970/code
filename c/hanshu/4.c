#include <stdio.h>
#include <string.h>

int main()
{
    int a[4]={1,2,3,4};

    printf("%d\n",sizeof(a));//16(整个数组)
    printf("%d\n",sizeof(a+0));//4 or 8(数组首元素地址)
    printf("%d\n",sizeof(*a));//4 or 8(数组首元素地址)
    printf("%d\n",sizeof(a+1));//4 0r 8(第二个元素地址)
    printf("%d\n",sizeof(a[1]));//4 0r 8(第二个元素地址)
    printf("%d\n",sizeof(&a));//4 0r 8(数组地址)
    printf("%d\n",sizeof(*&a));//16(整个数组)
    printf("%d\n",sizeof(&a+1));//4 or 8(地址)
    printf("%d\n",sizeof(&a[0]));//4 or 8(首元素地址)
    printf("%d\n",sizeof(&a[0]+1));//4 or 8(第二个与元素地址)
    return 0;
}