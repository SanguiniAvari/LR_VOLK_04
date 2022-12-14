package TIMUS;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class T_04_1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Long> deque = new LinkedList<>();

        while (scanner.hasNextLong())
            deque.addFirst(scanner.nextLong());

        for (Long l : deque)
            System.out.printf("%.4f\n", Math.sqrt(l));
    }
}
