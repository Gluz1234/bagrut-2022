import java.util.Arrays;

public class ex1 {
    public static int[] multiply(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return helper(arr1,arr2);
        } else if (arr1.length < arr2.length) {
            return helper(arr2,arr1);
        }
        else {
            return helper(arr1, arr2);
        }
    }
    public static int[] helper (int[] small, int[] large)
    {
        int i;
        int[] new_arr = new int[large.length];
        for (i = 0; i < small.length;i++)
        {
            new_arr[i] = small[i] * large[i];
        }
        if (small.length == large.length)
            return new_arr;
        for (int j = i;j<large.length;j++)
        {
            new_arr[j] = large[j];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        int[] test1 = {1,2,1,2};
        int[] test2 = {10,20,10,20};
        System.out.println("multiply = " + Arrays.toString(multiply(test1, test2)));
    }
}
