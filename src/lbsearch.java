public class lbsearch {
    public static void main(String[] args){

        int[] nums= new int[1000];
       // int[] nums={5,7,9,11,13};
        int target=900;

        int result= linearSearch(nums,target);
        int result1= BinarySearch(nums,target);

        if(result1 !=-1)
            System.out.println("Element found at Index:"+result1);
        else
            System.out.println("Element not found");
    }
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps:" + steps);
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] nums, int target) {
        int steps=0;
        int left=0;
        int right= nums.length-1;

        while(left<=right){
            steps++;
            int mid= (left+right)/2;

            if(nums[mid]==target){
                System.out.println("Steps taken by binary:"+steps);
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else
                right=mid-1;

        }
        System.out.println("Steps taken by binary:"+steps);
        return -1;
    }
}
