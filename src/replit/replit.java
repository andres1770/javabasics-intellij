package replit;

public class replit {
//Create the maxValue method that will accept int array and
    //  return the maximum value in the array.
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22,80};
        System.out.println(maxValue(arr)); //should print 22
    }

   public static int maxValue(int[] arr){
       int  max=arr[0];
       for(int i =0;i<arr.length;i++){
           if (arr[i]>max){
               max=arr[i];

           }
       }
return max;
    }
}
