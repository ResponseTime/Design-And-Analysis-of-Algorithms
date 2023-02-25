#include <stdio.h>
int partition(int *arr, int l, int h)
{
    int i = l, j = h;
    int pivot = arr[l];
    while (i < j)
    {
        do
        {
            i++;
        } while (arr[i] <= pivot);
        do
        {
            j--;
        } while (arr[j] > pivot);
        if (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[l];
    arr[l] = arr[j];
    arr[j] = temp;
    return j;
}
void quick_sort(int *arr, int l, int h)
{
    if (l < h)
    {
        int j = partition(arr, l, h);
        quick_sort(arr, l, j);
        quick_sort(arr, j + 1, h);
    }
}

int main(int argc, char **argv)
{
    int arr[] = {43, 57, 12, 34, 65, 23, 78, 45, 67, 89, 56, 34, 23, 12, 23, 45, 67, 89};
    int len = sizeof(arr) / sizeof(arr[0]);
    quick_sort(arr, 0, len);
    for (int i = 0; i < len; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}