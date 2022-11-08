package javaapplication21;
import java.util.Scanner;
public class JavaAplication21 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int operator;
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("pilihlah opertor diatas : ");
        operator = masukan.nextInt();
        if (operator == 1){
            int angka1, angka2, hasil;
            System.out.println("masukkan angka pertama :");
            angka1 = masukan.nextInt();
            System.out.println("masukkan angka kedua : ");
            angka2 = masukan.nextInt();
            hasil = angka1 + angka2;
            System.out.println("hasil dari "+angka1+" + "+angka2+" = "+hasil);
        }else if (operator == 2){
        int angka1, angka2, hasil;
            System.out.println("masukkan angka pertama :");
            angka1 = masukan.nextInt();
            System.out.println("masukkan angka kedua : ");
            angka2 = masukan.nextInt();
            hasil = angka1 - angka2;
            System.out.println("hasil dari "+angka1+" - "+angka2+" = "+hasil);
        }else if (operator == 3){
        int angka1, angka2, hasil;
            System.out.println("masukkan angka pertama :");
            angka1 = masukan.nextInt();
            System.out.println("masukkan angka kedua : ");
            angka2 = masukan.nextInt();
            hasil = angka1 * angka2;
            System.out.println("hasil dari "+angka1+" * "+angka2+" = "+hasil);
        }else if (operator == 4){
        int angka1, angka2, hasil;
            System.out.println("masukkan angka pertama :");
            angka1 = masukan.nextInt();
            System.out.println("masukkan angka kedua : ");
            angka2 = masukan.nextInt();
            hasil = angka1 / angka2;
            System.out.println("hasil dari "+angka1+" / "+angka2+" = "+hasil);
        }else{
            System.out.println("masukkan operator dengan benar!");}
        
    }
}

