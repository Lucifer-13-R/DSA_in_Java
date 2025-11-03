public class lsearch {
    
    public static void main(String[] args){

        int[] nums={5,7,9,11,13};
        int target=15;

        int result= linearSearch(nums,target);

        if(result!=-1)
            System.out.println("Element found at Index:"+result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps=0;

        for(int i=0;i<nums.length;i++) {
            steps++;
            if(nums[i]==target) {
                System.out.println("Steps:" + steps);
                return i;
            }
        }
        return -1;
    }
}
