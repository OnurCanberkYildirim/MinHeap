/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minheap;

/**
 *
 * @author Onur
 */
import java.util.Scanner; 

public class minheap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Lütfen sayıları virgül ile ayrılmış şekilde girin: ");
    String input = sc.nextLine();
    String[] numbers = input.split(",");
    
    int[] array = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      array[i] = Integer.parseInt(numbers[i]);
    }
    
    boolean isMinHeap = true;
    for (int i = 0; i < array.length / 2; i++) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      
      if (left < array.length && array[i] > array[left]) {
        isMinHeap = false;
        break;
      }
      
      if (right < array.length && array[i] > array[right]) {
        isMinHeap = false;
        break;
      }
    }
    
    if (isMinHeap) {
      System.out.println("Girilen sayıların oluşturduğu dizi minimum heap'tir.");
    } else {
      System.out.println("Girilen sayıların oluşturduğu dizi minimum heap değildir.");
    }
  }
}
