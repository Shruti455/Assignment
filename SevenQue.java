import java.util.*;
public class SevenQue {
       public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
 
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0){
            res.add(List.of(lower, upper));
            return res;
        }
        if(lower < nums[0]){
            res.add(List.of(lower, nums[0]-1));
        }
 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                res.add(List.of(nums[i]+1, nums[i+1]-1));
            }
        }
        if(nums[nums.length-1] < upper){
            res.add(List.of(nums[nums.length-1]+1, upper));
        }
 
        return res;
    }
    public static void main(String[] args) {
        int [] nums = { 0 , 1 , 3 , 50 , 75 };
        int lower = 0 ;
        int upper = 99 ;   
        System.out.println(findMissingRanges(nums , lower , upper)); 
    }
}
