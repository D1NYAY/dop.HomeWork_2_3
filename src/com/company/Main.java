package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }
}
