#include <stdio.h>
#include <string.h>
#include <assert.h>

//模拟器strlen函数

//计数器方法
/*
size_t my_strlen(const char* str)
{
    size_t count=0;
    assert(str);
    while(*str !='\0')
    {
        count++;
        str++;
    }
    return count;
}
int main()
{
    char arr[]={"abcdef"};
    size_t n = my_strlen(arr);
    printf("%zu\n",n);
    return 0;
}
*/

//指针-指针
/*
size_t my_strlen(const char* str)
{
    const char *start=str;
    while(*str)
    {
        str++;
    }
    return str-start;
}
int main()
{
    char arr[]="abcdef";
    size_t n=my_strlen(arr);
    printf("%zu\n",n);
    return 0;
}
*/

//递归方法

// size_t my_strlen(const char* str)
// {
//     if(*str=='\0')
//     {
//         return 0;
//     }
//     return 1+my_strlen(str+1);
// }
// int main()
// {
//     char arr[]="abcdef";
//     size_t n=my_strlen(arr);
//     printf("%zu\n",n);
//     return 0;
// }

