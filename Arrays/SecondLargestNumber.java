//Problem: Return Second Largest Element
//Time Complexity: O(2*n) = O(n)
//Auxiliary Space: O(1)
class Solution {
    public static int getSecondLargest(int[] arr) {
        // code here
        /*
        Algorithm:
        1. initialize int max and secondmax
        2. traverse array
        3. compare every element with each other, and update the value
        4. avoid duplicate values
        5. return secondmax value
        */
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
       for(int i =0; i < arr.length; i++){
           if(arr[i] > max){
               secondMax = max;
               max = arr[i];
           }
           else if( arr[i] > secondMax && arr[i]!= max){
               secondMax = arr[i];
           }
       }
       return secondMax;
    }
    public static void main(String args[]){
        int arr[] ={12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}