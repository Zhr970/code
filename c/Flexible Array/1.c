#include <stdio.h>
#include <stdlib.h>

//C99中，结构中的最后一个元素允许是未知大小的数组，这就叫做"柔性数组"成员。
//结构中的柔性数组成员前面必须至少一个其他成员。
//sizeof返回的这种结构大小不包括柔性数组的内存
//包含柔性数组成员的结构用malloc（函数进行内存的动态分配，并且分配的内存应该大于结构的大小，以适应柔性数组的预期大小。
//好处；方便内存释放，利于访问速度

// struct S
// {
//     int n;
//     int arr[0];
// };

// int main()
// {
//     int sz=sizeof(struct S);
//     printf("%d\n",sz);//(不包括数组arr)
//     //柔性数组使用
//     struct S* ps=(struct S*)malloc(sizeof(struct S)+40);
//     if(ps==NULL)
//     {
//         return 0;
//     }

//     ps->n=100;
//     int i=0;
//     for(i=0;i<10;i++)
//     {
//         ps->arr[i]=i;
//     }
//     for(i=0;i<10;i++)
//     {
//         printf("%d ",ps->arr[i]);
//     }

//     struct S* ptr=(struct S*)realloc(ps,sizeof(struct S)+80);
//     if(ptr!=NULL)
//     {
//         ps=ptr;
//         ptr=NULL;
//     }

//     free(ps);
//     ps=NULL;
//     return 0;
// }


struct S
{
    int n;
    int *arr;
};

int main()
{
    struct S* ps=(struct S*)malloc(sizeof(struct S));
    if(ps==NULL)
    {
        return 1;
    }
    ps->n=100;
    ps->arr=(int*)malloc(40);
    if(ps->arr==NULL)
    {
        return 1;
    }

    //使用
    int i=0;
    for(i=0;i<10;i++)
    {
        ps->arr[i]=i;
    }
    for(i=0;i<10;i++)
    {
        printf("%d ",ps->arr[i]);
    }

    //扩容
    int* ptr=(int*)realloc(ps->arr,80);
    if(ptr==NULL)
    {
        return 1;
    }

    //释放
    free(ps->arr);
    free(ps);
    ps=NULL;

    return 0;
}