package com.benno;
import java.util.Scanner;

    /*
    NAMA        : BENNO ALIF ANGGARA
    KELAS       : IF1
    NIM         : 10118024
    Deskripsi   : Menghitung Nilai Rata-Rata
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jmlMhs, i;
        double Nilai, jmlNilai = 0, Rerata;

        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jmlMhs = scanner.nextInt();

        for (i = 1; i <= jmlMhs; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            Nilai = scanner.nextDouble();
            jmlNilai += Nilai;
        }

        Rerata = jmlNilai / jmlMhs;

        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + Rerata);
        System.out.println("Developed by : Benno Alif Anggara");
    }
}
