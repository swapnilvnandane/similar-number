# Similar Numbers Finder

This project contains a Java program that finds the numbers that are similar in two sorted lists.

## Description

The program takes two sorted lists of integers and finds the numbers that are present in both lists. It uses a two-pointer technique to efficiently find the common elements.

## Example

Given the following lists:
- `list1 = [1, 2, 3, 4, 5]`
- `list2 = [4, 5, 6, 7, 8]`

The output will be:
- `[4, 5]`

## Usage

To run the program, execute the `main` method in the `Main` class. The program will print the common elements to the console.

## Code Structure

- `Main.java`: Contains the main method and the `findSimilarNumbers` method which implements the logic to find common elements in two sorted lists.

## Methods

### `findSimilarNumbers`

```java
private static List<Integer> findSimilarNumbers(List<Integer> list, List<Integer> list2)