package Quiz2;

public class Methods2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int total = total(nums);
        System.out.println("Total: " + total);
    }
    public static int total(int[] nums){
        int total = 0;
        for(int num : nums){
            total = total + num;
        }
        return total;
    }
}
