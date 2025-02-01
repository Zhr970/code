#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <errno.h>

//1

// void GetMemory(char* p)
// {
//     p=(char*)malloc(100);
// }

// void Test(void)
// {
//     char* str =NULL;
//     GetMemory(str);
//     strcpy(str,"hello world");
//     printf(str);//str为空指针，解应用时会崩溃，内存泄露
// }

//改法1
// void GetMemory(char** p)
// {
//     *p=(char*)malloc(100);
// }

// void Test(void)
// {
//     char* str =NULL;
//     GetMemory(&str);
//     strcpy(str,"hello world");
//     printf("%s\n",str);
//     free(str);
//     str=NULL;
// }
//改法2
// char* GetMemory(char* p)
// {
//     p=(char*)malloc(100);
//     return p;
// }

// void Test(void)
// {
//     char* str =NULL;
//     str=GetMemory(str);
//     strcpy(str,"hello world");
//     printf("%s\n",str);
//     free(str);
//     str=NULL;
// }

//2
// char* GetMemory(void)
// {
//     char p[]="hello world";
//     return p;//越界
// }
// void Test(void)
// {
//     char* str=NULL;
//     str=GetMemory();
//     printf("%s\n",str);
// }

//3
// void GetMeory(char** p,int num)
// {
//     *p=(char*)malloc(num);
// }

// void Test(void)
// {
//     char* str=NULL;
//     GetMeory(&str,100);
//     strcpy(str,"hello");
//     printf("%s\n",str);//内存泄漏
// }

//4
void Test(void)
{
    char* str=(char*)malloc(100);
    strcpy(str,"hello");
    free(str);
    if(str!=NULL)
    {
        strcpy(str,"hello");
        printf("%s\n",str);//野指针 
    }
}

int main()
{
    Test();
}