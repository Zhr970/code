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


// void* my_memcpy(void* dest,const void* src,size_t num)
// {
//     assert(dest && src);
//     void* ret=dest;

//     while(num--)
//     {
//         *(char*)dest = *(char*)src;
//         dest = (char*)dest + 1;
//         src = (char*)src + 1;
//     }
//     return ret;
// }
// int main()
// {
//     int arr1[]={1,2,3,4,5,6,7};
//     int arr2[10]={0};
//     //memcpy(arr2,arr1,28);//28字节数
//     my_memcpy(arr2,arr1,28);
//     return 0;
// }



// void* my_memove(void* dest,const void* src,size_t num)
// {
//     assert(dest && src);
//     void* ret = dest;
//     if(dest<src)
//     {
//         //前->后
//         while(num--)
//         {
//             *(char*)dest=*(char*)src;
//             dest=(char*)dest + 1;
//             src=(char*)src + 1;
//         }
//     }
//     else
//     {
//         //后->前
//         while(num--)
//         {
//             *((char*)dest+num) = *((char*)src+num);
//         }
//     }
//     return ret;

// }

// int main()
// {
//     char arr[]={1,2,3,4,5,6,7,8,9,10};
//     my_memove(arr+2,arr,5);
//     int i =0;
//     for(i=0;i<10;i++)
//     {
//         printf("%d\n",arr[i]);
//     }
//     return 0;
// }

//remcmp
// int main()
// {
//     int arr1[]={1,2,3,4,5};
//     int arr2[]={1,2,3};
//     int arr3[]={1,3,2};
//     int ret1=memcmp(arr1,arr2,12);
//     printf("%d\n",ret1);
//     int ret2=memcmp(arr1,arr3,12);
//     printf("%d\n",ret2);
//     return 0;
// }

//memset

// int main()
// {
//     char arr[]="Hello world";
//     memset(arr,'x',5);
//     printf("%s ",arr);
//     return 0;
// }