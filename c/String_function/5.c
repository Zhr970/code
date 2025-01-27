#include <stdio.h>
#include <string.h>
#include <errno.h>
#include <assert.h>

//strtok

// int main()
// {
//     const char* sep="@.";
//     char email[]="zhr15030727447@gmail.com";
//     char cp[50]={0};

//     strcpy(cp,email);

//     // char* ret=strtok(cp,sep);
//     // printf("%s\n",ret);

//     // ret=strtok(NULL,sep);
//     // printf("%s\n",ret);

//     // ret=strtok(NULL,sep);
//     // printf("%s\n",ret);

//     char* ret=NULL;
//     for(ret=strtok(cp,sep);ret!=NULL;ret=strtok(NULL,sep))
//     {
//         printf("%s\n",ret);
//     }
//     return 0;
// }

//strerror

// int main()
// {
//     printf("%s\n",strerror(0));
//     printf("%s\n",strerror(1));
//     printf("%s\n",strerror(2));
//     printf("%s\n",strerror(3));
//     printf("%s\n",strerror(4));



//     //errno是c语言设置的一个全局的错误码存放的变量
//     FILE* pf =fopen("5.c","r");
//     if(pf==NULL)
//     {
//         printf("%s\n",strerror(errno));
//     }
//     return 0;
// }

#include <ctype.h>

// int main()
// {
//     int a=isspace(' ');
//     printf("%d\n",a);

//     int b=isdigit('x');
//     printf("%d\n",b);

//     printf("%c\n",tolower('W'));
//     return 0;
// }


void* my_memcpy(void* dest,const void* src,size_t num)
{
    assert(dest && src);
    void* ret=dest;

    while(num--)
    {
        *(char*)dest = *(char*)src;
        dest = (char*)dest + 1;
        src = (char*)src + 1;
    }
    return ret;
}
int main()
{
    int arr1[]={1,2,3,4,5,6,7};
    int arr2[10]={0};
    //memcpy(arr2,arr1,28);//28字节数
    my_memcpy(arr2,arr1,28);
    return 0;
}

