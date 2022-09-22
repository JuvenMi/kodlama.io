package Quiz2;

public class ValueAndReferences {
    public static void main(String[] args) {
        /**
         * Value Types
         */
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);
        /**
         * Reference Types
         */
        int[] nums1 = {10, 20, 30};
        int[] nums2 = {40, 50, 60};
        nums2 = nums1;
        nums1[0] = 70;
        System.out.println(nums2[0]);
        /**
         * String
         */
        String str1 = "---Hello---";
        System.out.println(str1);
        System.out.println(str1.replace("-", ""));
    }
}
