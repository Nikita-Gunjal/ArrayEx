/*Question 1:Given an integer array nums, 
return true if any value appears at least twice in the array,
and return false if every element is distinct*/
public class SeventeenHW {
   public static boolean TwiceNumber(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
     public static void main(String[]args){
        int nums[]={1,2,3,1};
        System.out.println(TwiceNumber(nums));
    } 

/*Question 4:Given n non-negative integers representing an elevation map
 where the width of each bar is 1, compute how much water it can trap after raining */


 /*public static int ElevationMap(int height[]){
    int n= height.length;
    int leftMax[]= new int [n];
    leftMax[0]=height[0];
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i], leftMax[i-1]);
    }
        int rigthMax[]=new int[n];
        rigthMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rigthMax[i]=Math.max(height[i],rigthMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rigthMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    
    }
   

 
public static void main(String[]args){
    int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
    System.out.println(ElevationMap(height));

}*/
}



 