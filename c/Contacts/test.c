#include "contact.h"

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
            case 1:
                AddContact(&con);
                printf("\n");
                break;
            case 2:
                DelContact(&con);
                printf("\n");
                break;
            case 3:
                SearchContact(&con);
                printf("\n");
                break;
            case 4:
                ModifyContact(&con);
                printf("\n");
                break;
            case 5:
                ShowContact(&con);
                printf("\n");
                break;
            case 6:
                SortContact(&con);
                printf("\n");
                break;
            case 0:
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


