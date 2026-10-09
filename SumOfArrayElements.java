public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] marks = { 80, 75, 90, 65, 88 };
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
