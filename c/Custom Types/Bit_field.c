#include <stdio.h>
struct S
{
    char a:3;
    char b:4;
    char c:5;
    char d:4;
};

int main()
{
    struct S s={0};
    printf("%zu\n",sizeof(struct S));
    s.a=10;
    s.b=12;
    s.c=3;
    s.d=4;
    return 0;
}
