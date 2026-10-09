public class LargestElementFromArray {
    public static void main(String[] args) {
        int[] marks = { 80, 75, 90, 65, 88 };
        int largestEl = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > largestEl) {
                largestEl = marks[i];
            }
        }
        System.out.println(largestEl);
    }
}
