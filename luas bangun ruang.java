//nama : muhammad IKhsan
//nim : D0221075
//kelas : Informatika E
package pbo;
import java.util.Scanner;
public class PBO {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
    
        System.out.println("1. persegi");
        System.out.println("2. segitiga");
        System.out.println("3. lingkaran");
        System.out.println("pilih menu diatas");
        int pilihan;
        pilihan = masukan.nextInt();
        if (pilihan == 1){
            int sisi, hasil;
            System.out.println("masukkan panjang sisi : ");
            sisi = masukan.nextInt();
            hasil = sisi * sisi;
            System.out.println("luas dari persegi adalah : "+ hasil);
        }else if (pilihan == 2){
            int alas,tinggi,hasil;
            System.out.println("masukkan panjang alas segitiga : ");
            alas = masukan.nextInt();
            System.out.println("masukkan tinggi segitiga : ");
            tinggi = masukan.nextInt();
            hasil = alas * tinggi / 2;
            System.out.println("luas dari segitiga adalah : "+hasil);            
        }else if (pilihan == 3){
            double phi,diameter, r, hasil;
            System.out.println("");
            phi = 3.14;
            System.out.println("masukkan panjang diameter lingkaran : ");
            diameter = masukan.nextInt();
            r = diameter / 2;
            hasil = phi * r * r;
            System.out.println("luas dari lingkaran adalah : "+hasil);
        }else{
            System.out.println("jawaban yang anda masukkan salah");}
    }
    
}
