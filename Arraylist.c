#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
} node;

int insert(int *arr, int len, int index, int elem)
{
    for (int i = len - 1; i >= index; i--)
    {
        arr[i + 1] = arr[i];
    }
    arr[index] = elem;
    return ++len;
}
int removebyindex(int *arr, int len, int index)
{
    for (int i = index; i <= len; i++)
    {
        arr[i] = arr[i + 1];
    }
    return --len;
}
int main(int argc, char *argv)
{
    // int *arr = (int *)malloc(sizeof(int) * 20);
    // for (int i = 0; i < 10; i++)
    // {
    //     scanf("%d", &arr[i]);
    // }
    // int newlen = insert(arr, 10, 3, 100);
    // newlen = removebyindex(arr, newlen, 3);
    // for (int i = 0; i < newlen; i++)
    // {
    //     printf("%d ", arr[i]);
    // }
    struct node *head = (struct node *)malloc(sizeof(struct node));
    head->data = 100;
    head->next = NULL;
    struct node *p = (struct node *)malloc(sizeof(struct node));
    p->data = 200;
    p->next = NULL;
    head->next = p;
    printf("%d\n", head->data);
    printf("%d", head->next->data);
    return 0;
}