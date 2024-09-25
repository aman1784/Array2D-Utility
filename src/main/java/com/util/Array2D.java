package src.main.java.com.util;
import java.util.Arrays;

/**
 * A utility class for printing 2D arrays in a formatted string representation.
 * Supports both primitive types and reference types.
 */
public class Array2D {

    /**
     * Returns a formatted string representation of a 2D int array.
     *
     * @param array the 2D int array to format
     * @return a string representation of the array
     */
    public static String print2DArray(int[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < array.length; i++) {
            sb.append("  ").append(Arrays.toString(array[i]));
            if (i < array.length - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n]");
        return sb.toString();
    }

    /**
     * Returns a formatted string representation of a 2D double array.
     *
     * @param array the 2D double array to format
     * @return a string representation of the array
     */
    public static String print2DArray(double[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < array.length; i++) {
            sb.append("  ").append(Arrays.toString(array[i]));
            if (i < array.length - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n]");
        return sb.toString();
    }

    /**
     * Returns a formatted string representation of a 2D char array.
     *
     * @param array the 2D char array to format
     * @return a string representation of the array
     */
    public static String print2DArray(char[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < array.length; i++) {
            sb.append("  ").append(Arrays.toString(array[i]));
            if (i < array.length - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n]");
        return sb.toString();
    }

    /**
     * Returns a formatted string representation of a 2D array of any reference type.
     *
     * @param array the 2D array to format
     * @param <T>   the type of the elements in the array
     * @return a string representation of the array
     */
    public static <T> String print2DArray(T[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < array.length; i++) {
            sb.append("  ").append(Arrays.toString(array[i]));
            if (i < array.length - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n]");
        return sb.toString();
    }
}
