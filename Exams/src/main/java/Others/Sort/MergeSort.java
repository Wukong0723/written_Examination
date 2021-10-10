package Others.Sort;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        mySort(nums,0,nums.length-1,new int[nums.length]);
        return nums;
    }
    void mySort(int[] nums,int left,int right,int[] tmp){
        if(right - left <=7){
            insertSort(nums,left, right);
            return ;
        }
        int mid = left+(right-left)/2;
        mySort(nums,left,mid,tmp);
        mySort(nums,mid+1,right,tmp);
        if(nums[mid] > nums[mid+1]){
            mergeTwoArray(nums,left,mid,right,tmp);
        }


    }
    void insertSort(int[] nums ,int left,int right){
        for(int i =left+1;i<=right;i++){
            int tmp = nums[i];
            int j = i;
            while(j>left && nums[j-1] > tmp){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = tmp;
        }
    }

    void mergeTwoArray(int[] nums,int left,int mid,int right,int[] tmp){
        System.arraycopy(nums,left,tmp,left,right-left+1);
        int i = mid;
        int j = right;
        int pos = right;
        while(i>=left || j>=mid+1){
            if(i<left){
                nums[pos--] = tmp[j--];
            }else if(j<=mid){
                nums[pos--] = tmp[i--];
            }else{
                if(tmp[i] <= tmp[j]){
                    nums[pos--] = tmp[j--];
                }else{
                    nums[pos--] = tmp[i--];
                }
            }
        }
    }

}
