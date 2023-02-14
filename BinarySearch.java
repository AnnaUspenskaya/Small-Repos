    public static int binarySearch(int[] arr, int k) {
        //k - number that we need to find 
        // sort an array 
        Arrays.sort(arr);
        int begin = 0;
        int end = arr.length - 1;
        int index = 0;
        while (begin <= end) {
            //middle index
            int mid = begin + ((end - begin) / 2);
            if (arr[mid] > k) {
                //if middle index is higher than k, we check only the left side of arr 
                end = mid - 1;
            } else if (arr[mid] < k) {
                 //if middle index is lower than k, we check only the right side of arr 
                begin = mid + 1;
            } else if (arr[mid] == k) {
                //eventually, the middle index with be the number we need to find(if it exist )
                index = mid;
                break;
            }
        }
        return index;
    }