#include <stdio.h>
#include <string.h>
#include <stdlib.h>


/*void bubble_sort(int arr[],int sz)
{
    int i=0;
    for(i=0;i<sz-1;i++)
    {
        int j=0;
        for(j=0;j<sz-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
            
        }
    }
}*/

int cmp_int(const void*e1,const void*e2)
{
    return (*(int*)e1  - *(int*)e2);
}

void test1()
{
    int i=0;
    int arr[]={9,8,7,6,5,4,3,2,1,0};
    int sz=sizeof(arr)/sizeof(arr[0]);

    //bubble_sort(arr,sz);
    qsort(arr,sz,sizeof(arr[0]),cmp_int);

    for(i=0;i<sz;i++)
    {
        printf("%d ",arr[i]);
    }

}


struct Stu
{
    char name[20];
    int age;

};

int cmp_stu_vy_name(const void*e1,const void*e2)
{
    return strcmp(((struct Stu*)e1)->name,((struct Stu*)e2)->name);

}

int cmp_stu_vy_age(const void*e1,const void*e2)
{
    return ((struct Stu*)e1)->age - ((struct Stu*)e2)->age;

}

void test2()
{
    struct Stu s[]={{"zhangsan",15},{"lisi",30},{"wangwu",25}};
    int sz=sizeof(s)/sizeof(s[0]);
    //qsort(s,sz,sizeof(s[0]),cmp_stu_vy_name);
    qsort(s,sz,sizeof(s[0]),cmp_stu_vy_age);

}

//模拟库函数

void Swap(char*buf1,char*buf2,int width)
{
    int i=0;
    for(i=0;i<width;i++)
    {
        char tmp=*buf1;
        *buf1=*buf2;
        *buf2=tmp;
        buf1++;
        buf2++;
    }
}

void bubble_sort(void*base,int sz,int width,int(*cmp)(const void*e1,const void*e2))
{
    int i=0;
    for(i=0;i<sz-1;i++)
    {
        int flag=1;
        int j=0;

        for(j=0;j<sz-1-i;j++)
        {
            if(cmp((char*)base+j*width,(char*)base+(j+1)*width)>0)
            {
                Swap((char*)base +j*width,(char*)base +(j+1)*width,width);
                flag=0;
            }
        }

        if(flag==1)
        {
            break;
        } 
    }
    
}


void test3()
{
    int i=0;
    int arr[]={9,8,7,6,5,4,3,2,1,0};
    int sz=sizeof(arr)/sizeof(arr[0]);

    //bubble_sort(arr,sz);
    //qsort(arr,sz,sizeof(arr[0]),cmp_int);
    bubble_sort(arr,sz,sizeof(arr[0]),cmp_int);

    for(i=0;i<sz;i++)
    {
        printf("%d ",arr[i]);
    }

}


void test4()
{
    struct Stu s[]={{"zhangsan",15},{"lisi",30},{"wangwu",25}};
    int sz=sizeof(s)/sizeof(s[0]);
    //bubble_sort(s,sz,sizeof(s[0]),cmp_stu_vy_name);
    bubble_sort(s,sz,sizeof(s[0]),cmp_stu_vy_age);
}

int main()
{
    //test1();
    //test2();
    //test3();
    test4();
    return 0;
}