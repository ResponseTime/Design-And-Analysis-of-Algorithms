#include <stdio.h>
#include <stdlib.h>
int hash(int k, int m)
{
    return k % m;
}
struct Set
{
    int *arr;
    int size;
};
void init(struct Set *s, int size)
{
    s->arr = (int *)malloc(sizeof(int) * size);
    s->size = size;
    for (int i = 0; i < size; i++)
    {
        s->arr[i] = -1;
    }
}
void add(struct Set *s, int data)
{
    int i = hash(data, s->size);
    if (s->arr[i] == -1)
    {
        s->arr[i] = data;
    }
    else
    {
        while (s->arr[i] != -1)
        {
            i++;
        }
        s->arr[i] = data;
    }
}
void display(struct Set *s)
{
    for (int i = 0; i < s->size; i++)
    {
        printf("%d ", s->arr[i]);
    }
}
int main(int argc, char **argv)
{
    struct Set *s;
    init(s, 10);
    add(s, 5);
    add(s, 5);
    add(s, 2);
    display(s);
    return 0;
}