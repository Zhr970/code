#include <stdio.h>
#include <string.h>

int main()
{
    int a[]={1,2,3,4};

    printf("%d\n",sizeof(a));//16(整个数组)
    printf("%d\n",sizeof(a+0));//4 or 8(数组首元素地址)
    printf("%d\n",sizeof(*a));//4 or 8(数组首元素地址)
    printf("%d\n",sizeof(a+1));//4 0r 8(第二个元素地址)
    printf("%d\n",sizeof(a[1]));//4 0r 8(第二个元素地址)
    printf("%d\n",sizeof(&a));//4 0r 8(数组地址)
    printf("%d\n",sizeof(*&a));//16(整个数组)
    printf("%d\n",sizeof(&a+1));//4 or 8(数组后的地址)
    printf("%d\n",sizeof(&a[0]));//4 or 8(首元素地址)
    printf("%d\n",sizeof(&a[0]+1));//4 or 8(第二个与元素地址)
    printf("\n");

    char arr[]={'a','b','c','d','e','f'};

    printf("%d\n",sizeof(arr));//6(数组元素)
    printf("%d\n",sizeof(arr+0));////4 or 8(数组首元素地址)
    printf("%d\n",sizeof(*arr));//1(数组首元素)
    printf("%d\n",sizeof(arr[1]));//1(数组首元素)
    printf("%d\n",sizeof(&arr));//4 or 8(数组首元素地址)
    printf("%d\n",sizeof(&arr+1));//4 or 8(数组后的地址)
    printf("%d\n",sizeof(&arr[0]+1));//4 or 8(第二个元素地址)
    printf("\n");
    printf("%d\n",strlen(arr));//随机值
    printf("%d\n",strlen(arr+0));//随机值
    printf("%d\n",strlen(*arr));//野指针，报错
    printf("%d\n",strlen(arr[1]));//野指针，报错
    printf("%d\n",strlen(&arr));//随机值
    printf("%d\n",strlen(&arr+1));//随机值-6
    printf("%d\n",strlen(&arr[0]+1));//随机值-1
    printf("\n");

    char arr2[]="abcdef";

    printf("%d\n",sizeof(arr2));//7
    printf("%d\n",sizeof(arr2+0));//4 or 8(首元素地址)
    printf("%d\n",sizeof(*arr2));//1
    printf("%d\n",sizeof(arr2[1]));//1
    printf("%d\n",sizeof(&arr2));//4 or 8(数组首元素地址)
    printf("%d\n",sizeof(&arr2+1));//4 or 8(数组后的地址)
    printf("%d\n",sizeof(&arr2[0]+1));//4 or 8(第二个元素地址)
    printf("\n");
    printf("%d\n",strlen(arr2));//6
    printf("%d\n",strlen(arr2+0));//6
    printf("%d\n",strlen(*arr2));//野指针，报错
    printf("%d\n",strlen(arr2[1]));//野指针，报错
    printf("%d\n",strlen(&arr2));//6
    printf("%d\n",strlen(&arr2+1));//随机值
    printf("%d\n",strlen(&arr2[0]+1));//5
    printf("\n");

    char *p="abcdef";

    printf("%d\n",sizeof(p));//4 or 8
    printf("%d\n",sizeof(p+1));////4 or 8
    printf("%d\n",sizeof(*p));//1
    printf("%d\n",sizeof(p[0]));//1
    printf("%d\n",sizeof(&p));//4 or 8
    printf("%d\n",sizeof(&p+1));//4 or 8
    printf("%d\n",sizeof(&p[0]+1));//4 or 8
    printf("\n");
    printf("%d\n",strlen(p));//6
    printf("%d\n",strlen(p+1));//5
    printf("%d\n",strlen(*p));//野指针，报错
    printf("%d\n",strlen(p[0]));//野指针，报错
    printf("%d\n",strlen(&p));//随机值
    printf("%d\n",strlen(&p+1));//随机值
    printf("%d\n",strlen(&p[0]+1));//5


    


    return 0;
}