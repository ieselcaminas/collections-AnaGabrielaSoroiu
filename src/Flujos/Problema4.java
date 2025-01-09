package Flujos;

import java.util.Arrays;

public class Problema4 {
    public static void main(String[] args) {
       int[] num = {1, 10, 3, 5, 22};

       Arrays.stream(num)
               .filter(n -> n >= 1)
               .filter(n -> n <= 5)
               .forEach(n -> System.out.print(n + " "));
    }
}
