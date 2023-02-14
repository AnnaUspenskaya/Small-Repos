    public int[] findAddends(int sum, int[] nums) {
        Arrays.sort(nums);
        int pointerL = 0;
        int pointerR = nums.length - 1;
        int[] res = new int[2];
        while (pointerL < pointerR) {
            int sumUp = nums[pointerL] + nums[pointerR];
            if (sumUp > sum) {
                pointerR--;
            } else if (sumUp < sum) {
                pointerL++;
            } else if (sumUp == sum) {
                res[0] = nums[pointerL];
                res[1] = nums[pointerR];
                break;
            }
        }
        return res;
    }