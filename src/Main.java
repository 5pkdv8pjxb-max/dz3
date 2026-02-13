public class Main {
    public static void main(String[] args) {
        System.out.println("Было");
        int[][] nums =
                {
                        {8, 2, 3},
                        {6, 9, 4},
                        {7, 1, 9}
                };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int l = 0; l < nums.length; l++) {
                int pos = l;
                int min = nums[i][l];
                for (int j = l + 1; j < nums.length; j++) {
                    if (nums[i][j] < min) {
                        pos = j;
                        min = nums[i][j];
                    }
                }
                nums[i][pos] = nums[i][l];
                nums[i][l] = min;
            }
        }
        System.out.println("Стало");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}
