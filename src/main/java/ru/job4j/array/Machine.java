package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        while (money - price > 0) {
            for (int i = 0; i < 4; i++) {
                if (money - price >= coins[i]) {
                    size++;
                    rsl[size - 1] = coins[i];
                    money -= coins[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
