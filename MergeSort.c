#include <stdio.h>

void merge(int *arr, int left, int mid, int right)
{
    int i = left;
    int j = mid + 1;
    int k = 0;
    int temp[right - left + 1];
    while (i <= mid && j <= right)
    {
        if (arr[i] <= arr[j])
        {
            temp[k++] = arr[i++];
        }
        else
        {
            temp[k++] = arr[j++];
        }
    }
    while (i <= mid)
    {
        temp[k++] = arr[i++];
    }
    while (j <= right)
    {
        temp[k++] = arr[j++];
    }
    for (int i = left, k = 0; i <= right; i++, k++)
    {
        arr[i] = temp[k];
    }
}
void breaker(int *arr, int left, int right)
{
    if (left < right)
    {
        int mid = (left + right) / 2;
        breaker(arr, left, mid);
        breaker(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}
int main(int argc, char **argv)
{
    int arr[] = {23, 76, 43, 45, 12, 67, 89, 34, 56, 78, 90, 32, 54, 76, 98, 21, 43, 65, 87, 9, 0};
    int size = sizeof(arr) / sizeof(arr[0]);
    breaker(arr, 0, size - 1);
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}