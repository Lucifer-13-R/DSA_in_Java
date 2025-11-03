public class bsearch {

    public static void main(String[] args){

        int nums[]={5,7,9,11,13};
        int target=13;

        int result= BinarySearch(nums,target,0,nums.length-1);

        if(result!=-1)
            System.out.println("Element found at Index:"+result);
        else
            System.out.println("Element not found");
    }

    public static int BinarySearch(int[] nums, int target,int left ,int right) {
        if(left <=right){
            int mid=(left+ right)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                return BinarySearch(nums,target,mid+1,right);
            }
            else return BinarySearch(nums,target,left,mid-1);

        }

//
//
//        int steps=0;
//        int left=0;
//        int right= nums.length-1;
//
//        while(left<=right){
//            steps++;
//            int mid= (left+right)/2;
//
//            if(nums[mid]==target){
//                System.out.println("Steps taken by binary:"+steps);
//                return mid;
//            }
//            else if(nums[mid]<target){
//                left=mid+1;
//            }
//            else
//                right=mid-1;
//
//        }
//        System.out.println("Steps taken by binary:"+steps);
        return -1;
    }
}
