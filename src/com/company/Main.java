package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int generate = GenerateRandomage(random.nextInt(30));

        if (generate > 10 && generate < 23 ) {
            System.out.println("mojno li idti gul9t");
        }else {
            System.out.println("new ne mojesh");
        }

    }
    public static int GenerateRandomage(int age){
        return age;
    }


}



