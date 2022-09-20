public class RecapDemo2 {
    public static void main(String[] args) {
        int total = 0, bigNum;
        int[] nums = {1, 2, 3, 4, 30};
        bigNum = nums[0];
        for (int num : nums){
            total = total + num;
            if (num > bigNum){
                bigNum = num;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Biggest number: " + bigNum);
    }
}
