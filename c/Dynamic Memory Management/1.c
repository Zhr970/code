#include <stdio.h>
#include <errno.h>
#include <string.h>
#include <stdlib.h>


int main()
{
    int arr[10]={0};
    //动态内存开辟
    int*p=(int*)malloc(40);

    if(p==NULL)
    {
        printf("%s\n",strerror(errno));
        return 1;
    }
    //使用 
    int i=0;
    for(i=0;i<10;i++)
    {
        *(p+i)=i;
    }

    for(i=0;i<10;i++)
    {
        printf("%d ",*(p+i));
    }

    //释放内存
    free(p);
    p=NULL;

    //扩容
    int* ptr=(int*)realloc(p,80);//80为扩容后的内存

    if(ptr!=NULL)
    {
        p=ptr;
    }

    for(i=0;i<10;i++)
    {
        printf("%d ",*(p+1));
    }

    free(p);
    p=NULL;

    return 0;
}

// int main()
// {
//     int*p=(int*)calloc(10,sizeof(int));

//     if(p==NULL)
//     {
//         printf("%s\n",strerror(errno));
//         return 1;
//     }
//     int i=0;
//     for(i=0;i<10;i++)
//     {
//         printf("%d ",*(p+i));
//     }

//     free(p);
//     p=NULL;

//     return 0;
// }


