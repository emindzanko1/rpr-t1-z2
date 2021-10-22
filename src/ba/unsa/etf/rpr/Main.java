package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int Suma(int n){
        int suma = 0;
        while(n != 0){
            int ostatak = n % 10;
            suma = suma + ostatak;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner ulaz1 = new Scanner(System.in);
        int prvi = ulaz1.nextInt();
        for(int i = 1; i <= prvi; i++) if(i % Suma(i) == 0) System.out.println(i);
    }
}
