package org.learning;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        for (int i =0 ; i<nums.length ; i++){
            int sumRequired = target -nums[i];
            for (int j=i+1 ; j<nums.length ; j++){
                if(nums[j] == sumRequired){
                    int[] indices;
                    indices = new int[]{i,j};
                    return indices;
                }

            }
        }
        return null ;
    }

    public static int[] twoSumUsingHashMap (int[] num,int target){
        HashMap<Integer,Integer> counter = new HashMap<Integer, Integer>();
        for (int i=0; i< num.length;i++){
                Integer itemToFind = target - num[i];
                if(counter.containsKey(itemToFind)){
                    return new int[]{i,counter.get(itemToFind)};
                } else{
                    counter.put(num[i],i);
                }
        }
        return null;
    }

    public static void main(String[] args) {
        int target =67;
        int nums[] = {1,6,2,65,43,2,3,1};

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumUsingHashMap(nums, target)));
    }
}