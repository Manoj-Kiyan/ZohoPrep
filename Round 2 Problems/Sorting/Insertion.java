package Sorting;

import java.util.*;

public class Insertion {
  public static void main(String[] args) {
    int[] arr={7,5,2,3,4,1};
    Insert(arr);
  }
  public static void Insert(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
  }
}
