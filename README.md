# Lab 08 – Methods II

## 1. Objective
The purpose of this Lab is to familiarize students with:
1. Method overloading
2. Reusing existing methods

## 2. Lab Learning Outcomes (LLO)
By completion of the lab, the students should be able to:
1. Create overloaded methods
2. Reuse existing methods

## 3. Theory Review – Method Overloading
Method overloading in Java allows multiple methods to have the same name but with different parameter lists.
The difference between overloaded methods can be in:
- Number of parameters
- Data type of parameters
- Order of parameters

Method overloading improves code readability and reusability.

### Example of Method Overloading:
```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}

public static int add(int a, int b, int c) {
    return a + b + c;
}
