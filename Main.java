import src.main.java.com.util.Array2D;

public class Main {
    public static void main(String[] args) {
        // Example with Integer array
        Integer[][] intArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        String intArrayString = Array2D.print2DArray(intArray);
        System.out.println("Integer Array:\n" + intArrayString);

        // Example with primitive int array
        int[][] primitiveIntArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        String primitiveIntArrayString = Array2D.print2DArray(primitiveIntArray);
        System.out.println("Primitive Integer Array:\n" + primitiveIntArrayString);

        // Example with String array
        String[][] strArray = {
            {"Hello", "World"},
            {"Java", "Generics"},
            {"Array", "2D"}
        };
        String strArrayString = Array2D.print2DArray(strArray);
        System.out.println("String Array:\n" + strArrayString);

        // Example with double array
        double[][] doubleArray = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5},
            {6.6, 7.7, 8.8, 9.9}
        };
        String doubleArrayString = Array2D.print2DArray(doubleArray);
        System.out.println("Double Array:\n" + doubleArrayString);
    }
}
