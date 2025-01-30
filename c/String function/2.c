#include <stdio.h>
#include <string.h>
#include <assert.h>

//模拟实现strcpy函数
/*
char* my_strcpy(char* dest,const char* src)
{
    assert(dest && src);
    char* ret = dest;
    while(*dest++ = *src++)
        ;
    return ret;

}
int main()
{
    char arr1[]="abcdef";
    char arr2[]={0};
    my_strcpy(arr2,arr1);
    printf("%s\n",arr2);
    return 0;
}
*/

//模拟实现strcat函数

char* my_strcat(char* dest,const char* src)
{
    char* ret=dest;
    assert(dest && src);
    while(*dest != '\0')
    {
        dest++;
    }

    while(*dest++ = *src++)
        ;
    return ret;
}
int main()
{
    char arr[]="hello ";
    my_strcat(arr,"world");
    printf("%s\n",arr);
    return 0;
}