import java.util.Arrays;

public class ArrayHomework {
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.format("The number of items in the array is %s", weekdays.length);
        System.out.format("\nThe 4th day in the array is %s", weekdays[3]);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\n" + Arrays.toString(nums));
    }
}
