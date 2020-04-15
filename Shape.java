class Shape {
    public static void main(String[] args) {
        Integer[][] array2D = {{1, 5, 7}, {8, 4, 3, 2}, {2, 5, 6, 2, 1}, {100, 32, 1, -1}};

        int[] largest = { array2D[0][0], 0, 0 };
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > largest[0]) {
                    largest[0] = array2D[i][j];
                    largest[1] = i;
                    largest[2] = j;
                }
            }
        }
        
        System.out.println("The largest number is " + largest[0] + " at position (" + largest[1] + ", " + largest[2] + ").");
    }
}