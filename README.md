# Array2D-Utility

A utility class for printing 2D arrays in a formatted string representation. Supports both primitive types and reference types.

## Features

- Print 2D arrays of integers, doubles, characters, and any object type.
- Well-documented and easy to integrate into existing projects.

## Usage Instructions

### Step 1: Clone or Download the Repository

You can clone this repository or download it as a ZIP file.

### Step 2: Add the `Array2D` Class to Your Project

1. Copy `Array2D.java` into your project's source directory.
2. Update the package declaration if necessary.

### Step 3: Example Usage

Here's how you can use the `Array2D` class in your project:

```java
import src.main.java.com.util.Array2D; // Adjust the package as needed

public class ExampleUsage {
    public static void main(String[] args) {
        // Example with Integer array
        Integer[][] intArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        String output = Array2D.print2DArray(intArray);
        System.out.println("Integer Array:\n" + output);
    }
}
