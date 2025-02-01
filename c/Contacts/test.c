#include "contact.h"


enum options
{
    EXIT,
    ADD,
    DEL,
    SEARCH,
    MODIFY,
    SHOW,
    SORT

};
void menu()
{
    printf("*************************\n");
    printf(" 1.add    2.del  3.search\n");
    printf(" 4.modify 5.show 6.sort\n");
    printf(" 0.ezit\n");
    printf("************************\n");
    printf(" 请输入操作数字:");


}
int main()
{
    int input=0;
    Contact con;
    InitContact(&con);
    do
    {
        menu();
        scanf("%d",&input);
        switch(input)
        {
            case ADD:
                AddContact(&con);
                printf("\n");
                break;
            case DEL:
                DelContact(&con);
                printf("\n");
                break;
            case SEARCH:
                SearchContact(&con);
                printf("\n");
                break;
            case MODIFY:
                ModifyContact(&con);
                printf("\n");
                break;
            case SHOW:
                ShowContact(&con);
                printf("\n");
                break;
            case SORT:
                SortContact(&con);
                printf("\n");
                break;
            case EXIT:
                //DestroyContact(&con);
                printf("已退出\n");
                break;
            default:
                printf("选择错误\n");
                printf("\n");
                break;
        }
    }while(input);
    return 0;
}


