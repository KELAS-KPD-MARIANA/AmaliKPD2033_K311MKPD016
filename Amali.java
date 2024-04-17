package amali;
import java.util.Scanner;
public class Amali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        String nama;
        int hari_bekerja, gaji;

        nama = input.nextLine();

        System.out.println("Masukkan bilangan hari bekerja : ");
        hari_bekerja = input.nextInt();

        if (hari_bekerja > 31) {
            System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
            System.out.println("Masukkan bilangan hari bekerja : ");
            hari_bekerja = input.nextInt();
        }

        gaji = hari_bekerja * 120;

        System.out.println("Rumusan gaji bulanan bagi " + nama);
        System.out.println("Jumlah hari bekerja " + hari_bekerja);
        System.out.println("GAJI SEBULAN ADALAH " + gaji);
    }
}