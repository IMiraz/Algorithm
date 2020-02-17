private static void quickSort (int[] array, int left, int right) {
    int index = partition(array, left, right);

    //Sort left half
    if (left < index - 1)
        quickSort(array, left, index - 1);

    //Sort right half
    if (index < right)
        quickSort(array, index , right);
}

private static int partition (int array[], int left, int right) {
    int pivot = array[(left + right) / 2]; //Pick pivot point
    while (left <= right) {
        //Find element on left that should be on right
        while (array[left] < pivot)
            left++;

        //Find element on right that should be on left
        while (array[right] > pivot)
            right--;

        //Swap elements and move left and right indices
        if (left <= right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    return left;
}
