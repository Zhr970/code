#include <string.h>
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#define MAX 100

//人的信息
typedef struct PeoInfo
{
    char name[20];
    char sex[10];
    char tele[12];
    char addr[30];
    int age;
}PeoInfo;

//通讯录
typedef struct Contact
{
    PeoInfo data[MAX];//存放人的信息
    int count;//记录当前通讯录中实际人的个数
}Contact;

//初始化通讯录
void InitContact(Contact* pc);

//增加联系人通讯录
void AddContact(Contact* pc);

//删除通讯录人员信息
void DelContact(Contact* pc);

//查询指定通讯录人员信息
void SearchContact(Contact* pc);

//修改指定人员信息
void ModifyContact(Contact* pc);

//打印通讯录信息
void ShowContact(const Contact* pc);

//排序通讯录中的内容
//按照名字来排序
void SortContact(Contact* pc);

