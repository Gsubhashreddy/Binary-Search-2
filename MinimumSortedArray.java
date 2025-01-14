// T(n)=O(log n)
// S(n) = O(1)
class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        int li=6000;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            System.out.println(i+" "+mid+" "+j);

            if(nums[i]<=nums[mid])
            {
                //This is Sorted Array
                if(li>nums[i])
                    li=nums[i];
                i=mid+1;
                
            }
            else if(nums[mid+1]<=nums[j])
            {
                //This is Sorted Array
                if(li>nums[mid+1])
                    li=nums[mid+1];
                j=mid-1;
            }
            if(li>nums[mid])
                li=nums[mid];
            
        }
        return li;
        
    }
}