#include <stdio.h>
#include <string.h>
#include <assert.h>
//strncpy,strncat,strncmp

// int main()
// {
//     //strncpy
//     char arr1[]="abcde";
//     char arr2[]="hello";
//     strncpy(arr1,arr2,5);//多出部分补\0
//     printf("%s\n",arr1);

//     //strncat
//     char arr3[20]="hello";
//     char arr4[20]="world";
//     strncat(arr3,arr4,4);//多出部分不会补\0
//     printf("%s\n",arr3);

//     //strncmp
//     int ret=strncmp(arr1,arr2,3);
//     if(ret<0)
//         printf("<\n");
//     else if(ret==0)
//         printf("=\n");
//     else
//         printf(">\n");
//     return 0;
// }


//strstr

char* my_strstr(const char* str1,const char* str2)
{
    assert(str1 && str2);
    const char* s1=str1;
    const char* s2=str2;
    const char* p=str1;

    while(*p)
    {
        s1=p;
        s2=str2;
        while(*s1!='\0' && *s2!='\0' && *s1 == *s2)
        {
            s1++;
            s2++;
        }
        if(*s2 == '\0')
            return (char*)p;
        p++;
    }
    return NULL;
}

int main()
{
    char str[]="Hello world";
    char substr[]="world";
    //char* ret=strstr(str,substr);
    char* ret=my_strstr(str,substr);
    if(ret==NULL)
        printf("字符串不存在\n");
    else
        printf("字符串存在\n");
    return 0;
}


//gpt改进

// const char* my_strstr(const char* str1, const char* str2)
// {
//     assert(str1 && str2);

//     // 如果 str2 是空字符串，直接返回 str1
//     if (*str2 == '\0') {
//         return str1;
//     }

//     const char* s1 = str1;
//     const char* s2 = str2;
//     const char* p = str1;

//     while (*p) {
//         s1 = p;
//         s2 = str2;
//         while (*s1 != '\0' && *s2 != '\0' && *s1 == *s2) {
//             s1++;
//             s2++;
//         }
//         if (*s2 == '\0') {
//             return p;
//         }
//         p++;
//     }
//     return NULL;
// }

// int main()
// {
//     char str[] = "Hello world";
//     char substr[] = "world";
//     //char* ret = strstr(str, substr);
//     const char* ret = my_strstr(str, substr);
//     if (ret == NULL) {
//         printf("字符串不存在\n");
//     } else {
//         printf("字符串存在，位置: %ld\n", ret - str);
//     }
//     return 0;
// }