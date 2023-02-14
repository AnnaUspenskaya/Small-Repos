    public  int[] sort(int[] arr) {
        //base case
        int n = arr.length;
        if (n < 2) {
            return arr;
        }
        //divide the array in half
        int[] left = Arrays.copyOfRange(arr, 0, n / 2);
        int[] right = Arrays.copyOfRange(arr, n / 2, n);

        //divide each half recursively 
        int[] leftPart = sort(left);
        int[] rightPart = sort(right);

        //sort and combine all halves
        return merge(leftPart, rightPart, n);
    }

    private  int[] merge(int[] left, int[] right, int n) {

        int[] res = new int[n];
        //indexes/point for the left and right parts 
        int l = 0;
        int r = 0;

        for (int i = 0; i < n; i++) {
            if (l < left.length && (r >= right.length || left[l] < right[r])) {
                res[i] = left[l];
                l++;
            } else {
                res[i] = right[r];
                r++;
            }
        }
        return res;