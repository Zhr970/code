#include <stdio.h>
#include <string.h>
#include <assert.h>

//strcmp

// int main()
// {
//     char arr1[]="abcdef";
//     char arr2[]="abcd";
//     int ret=strcmp(arr1,arr2);
//     if(ret<0)
//         printf("<\n");
//     else if(ret==0)
//         printf("=\n");
//     else
//         printf(">\n");
    
//     return 0;
// }

//模拟实现

int my_strcmp(const char* str1,const char* str2)
{
    assert(str1 && str2);
    while(*str1 ==*str2)
    {
        if(*str1 == '\0')
            return 0;
        str1++;
        str2++;
    }
    return (*str1-*str2);
}
int main()
{
    char arr1[]="abcdef";
    char arr2[]="abcd";
    int ret=my_strcmp(arr1,arr2);
    if(ret<0)
        printf("<\n");
    else if(ret==0)
        printf("=\n");
    else
        printf(">\n");
    
    return 0;
    return 0;
}