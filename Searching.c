#include <stdio.h>

int linear(int *arr, int len, int elem)
{
    for (int i = 0; i < len; i++)
    {
        if (arr[i] == elem)
        {
            return i;
        }
    }
    return -1;
}
int binary(int *arr, int len, int elem)
{
    int left = 0;
    int right = len - 1;
    while (left <= right)
    {
        int mid = (left + right) / 2;
        if (arr[mid] == elem)
        {
            return mid;
        }
        else if (elem < arr[mid])
        {
            right = mid - 1;
        }
        else
        {
            left = mid + 1;
        }
    }
    return -1;
}
int main(int argc, char **argv)
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int index = linear(arr, 10, 5);
    printf("%d\n", index);
    index = binary(arr, 10, 1);
    printf("%d", index);
    return 0;
}