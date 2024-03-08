import java.util.*;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan kecepatan = ");
        int kecepatan = input.nextInt();
        m1.setKecepatan(kecepatan);
        input.nextLine();
        System.out.print("Masukkan manufaktur = ");
        String manufaktur = input.nextLine();
        m1.setManufaktur(manufaktur);
        System.out.print("Masukkan noplat = ");
        String noplat = input.nextLine();
        m1.setNoPlat(noplat);
        System.out.print("Masukkan warna = ");
        String warna = input.nextLine();
        m1.setWarna(warna);
        System.out.print("Masukkan waktu = ");
        double waktuSek = input.nextDouble();
        m1.setWaktu(waktuSek);
        m1.hitungJarak(waktuSek);
        m1.hitungKm(waktuSek);
        m1.displayMessage();
        System.out.println("================");

        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.displayMessage();
        System.out.println("================");
        // merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
