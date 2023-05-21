public class Array {
    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arrays.length; i++) {
            for (int number : arrays[i]) {
                System.out.print(number+" ");
            }
        }
    }
}