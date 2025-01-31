#include <stdio.h>

// enum Day
// {
//     Mon,//0
//     Tues,//1
//     Wed,//2
//     Thur,//3
//     Fri,//4
//     Sat,//5
//     Sun//6
// };

enum Day
{
    Mon=1,//1
    Tues,//2
    Wed,//3
    Thur,//4
    Fri,//5
    Sat,//6
    Sun//7

};
int main()
{
    enum Day d=Fri;
    printf("%d\n",d);
    return 0;
}
