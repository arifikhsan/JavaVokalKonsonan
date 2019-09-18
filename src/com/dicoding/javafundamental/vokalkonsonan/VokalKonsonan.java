package com.dicoding.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        System.out.print("Masukkan kalimat: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        vokal = numVokal(word);
        konsonan = numKonsonan(word);

        System.out.println("Jumlah huruf vokal: " + vokal);
        System.out.println("Jumlah huruf konsonan: " + konsonan);
    }

    private static int numVokal(String word) {
        int i;
        int jumlahVokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||
                    word.charAt(i) == 'i' ||
                    word.charAt(i) == 'u' ||
                    word.charAt(i) == 'e' ||
                    word.charAt(i) == 'o') {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }

    private static int numKonsonan(String word) {
        int i;
        int jumlahKonsonan = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' ||
                    word.charAt(i) != 'i' ||
                    word.charAt(i) != 'u' ||
                    word.charAt(i) != 'e' ||
                    word.charAt(i) != 'o') {
                jumlahKonsonan++;
            }
        }
        return jumlahKonsonan;
    }
}
