public class MajorityElement {
        public static int findMajorityElement(int[] nums) {
            int n = nums.length;
            
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
                if (count > n / 2) {
                    return nums[i];  // Majority element found
                }
            }
            
            return -1;  // No majority element found
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 3, 4, 2, 3, 3, 3};
            System.out.println("Majority Element: " + findMajorityElement(arr));  // Output: 3
        }
    }
