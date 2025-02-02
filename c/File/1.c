#include <stdio.h>
#include <string.h>
#include <errno.h>

//打开文件
//FILE* fopen(const char* filename,const char* mode);
//mode:r,w,a,r+,w+,a+

int main()
{
    //打开文件
    FILE* pf=fopen("2.c","r");
    if(pf==NULL)
    {
        printf("%s\n",strerror(errno));
        return 1;
    }

    //关闭文件
    fclose(pf);
    pf=NULL;
    return 0;
}