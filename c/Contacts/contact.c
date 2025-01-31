#include "contact.h"

void InitContact(Contact* pc)
{
    assert(pc);
    pc->count=0;
    memset(pc->data,0,sizeof(pc->data));
    
}
int FindName(Contact* pc,char name[])
{
    assert(pc);
    int i=0;
    for(i=0;i<pc->count;i++)
    {
        if(0==strcmp(pc->data[i].name,name))
        {
            return i;
        }

    }
    return -1;


}
void AddContact(Contact* pc)
{
    assert(pc);
    if(pc->count==MAX)
    {
        printf("通讯录已满，无法添加\n");
        return;
    }
    printf("请输入名字:");
    scanf("%s",pc->data[pc->count].name);
    printf("请输入年龄:");
    scanf("%d",&pc->data[pc->count].age);
    printf("请输入性别:");
    scanf("%s",pc->data[pc->count].sex);
    pc->count++;
    printf("增加成功\n");
}

void DelContact(Contact* pc)
{
    char name[20]={0};
    assert(pc);
    if(pc->count==0)
    {
        printf("通讯录为空，没有信息可以删除\n");
        return;
    }
    printf("请输入需要删除人的名字:");
    scanf("%s",name);
    //查找
    int pos=FindName(pc,name);
    if(pos==-1)
    {
        printf("要删除的人不存在\n");
        return;
    }
    //删除
    int i=0;
    for(i=pos;i<pc->count-1;i++)
    {
        pc->data[i]=pc->data[i+1];
    }
    pc->count--;
}

void SearchContact(Contact* pc)
{
    assert(pc);
    char name[20]={0};
    printf("请输入需要查找的人的名字:");
    scanf("%s",name);
    int pos=FindName(pc,name);
    if(pos==-1)
    {
        printf("要查找的人不存在\n");
        return;
    }
    printf("%-20s\t%-5s\t%-5s\n","名字","年龄","性别");
    printf("%-20s\t%-5d\t%-5s\n",pc->data[pos].name,
            pc->data[pos].age,
            pc->data[pos].sex);
}

void ModifyContact(Contact* pc)
{
    assert(pc);
    char name[20]={0};
    printf("请输入需要修改的人的名字:");
    scanf("%s",name);
    int pos=FindName(pc,name);
    if(pos==-1)
    {
        printf("要修改的人不存在\n");
        return;
    }
    printf("开始修改\n");
    printf("请输入名字:");
    scanf("%s",pc->data[pos].name);
    printf("请输入年龄:");
    scanf("%d",&pc->data[pos].age);
    printf("请输入性别:");
    scanf("%s",pc->data[pos].sex);
    printf("修改成功\n");
    
}

void ShowContact(const Contact* pc)
{
    assert(pc);
    int i=0;
    printf("%-20s\t%-5s\t%-5s\n","名字","年龄","性别");
    for(i=0;i<pc->count;i++)
    {
        printf("%-20s\t%-5d\t%-5s\n",pc->data[i].name,
            pc->data[i].age,
            pc->data[i].sex);
    }
}

int cmp_peo_by_name(const void*e1,const void*e2)
{
    return strcmp(((PeoInfo*)e1)->name,((PeoInfo*)e2)->name);
}
//按照名字来排序
void SortContact(Contact* pc)
{
    assert(pc);
    qsort(pc->data,pc->count,sizeof(PeoInfo),cmp_peo_by_name);
    printf("排序成功\n");
    int i=0;
    printf("%-20s\t%-5s\t%-5s\n","名字","年龄","性别");
    for(i=0;i<pc->count;i++)
    {
        printf("%-20s\t%-5d\t%-5s\n",pc->data[i].name,
            pc->data[i].age,
            pc->data[i].sex);
    }
}