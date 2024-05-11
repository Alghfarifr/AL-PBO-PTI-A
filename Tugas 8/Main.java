// kelas utama yang akan menjadi titik masuk utama saat program dijalankan.
public class Main {
    // mendefinisikan metode "main" yang merupakan titik masuk utama program. Semua kode yang dieksekusi akan berada di dalam metode ini.
    public static void main(String[] args) {

        // membuat sebuah objek dari kelas "HeroIntel" dengan nama "hero1" dan menginisialisasinya dengan nama "Ucup" dan nilai kekuatan "100".
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        // memanggil metode "display()" dari objek "hero1" untuk menampilkan informasi tentang objek tersebut.
        hero1.display();

        // melakukan casting objek "hero1" dari tipe "HeroIntel" ke tipe "Hero". Ini dilakukan karena "HeroIntel" adalah subclass dari "Hero", sehingga dapat di-cast ke tipe "Hero".
        Hero heroUp = (Hero) hero1;
        // memanggil metode "display()" dari objek "heroUp" yang sekarang sudah di-cast menjadi tipe "Hero".
        heroUp.display();

        // membuat objek dari kelas "Hero" dengan nama "heroReg" dan menginisialisasinya dengan nama "Boy" dan nilai kekuatan "100".
        Hero heroReg = new Hero("Boy", 100);
        // memanggil metode "display()" dari objek "heroReg" untuk menampilkan informasi tentang objek tersebut.
        heroReg.display();

        // melakukan casting objek "heroUp" dari tipe "Hero" ke tipe "HeroIntel". Ini dilakukan karena "heroUp" sebelumnya telah di-cast dari tipe "HeroIntel" ke tipe "Hero", sehingga mencoba dikembalikan ke tipe semula.
        HeroIntel hero2 = (HeroIntel) heroUp;
        // memanggil metode "display()" dari objek "hero2" yang sekarang sudah di-cast kembali menjadi tipe "HeroIntel".
        hero2.display(); 

        // membuat objek dari kelas "HeroMagic" dengan nama "magicHero" dan menginisialisasinya dengan nama "Zara" dan nilai kekuatan "120"
        HeroMagic magicHero = new HeroMagic("Zara", 120);
        // memanggil metode "display()" dari objek "magicHero" untuk menampilkan informasi tentang objek tersebut.
        magicHero.display();

        // mencoba melakukan casting objek "magicHero" dari tipe "HeroMagic" ke tipe "Hero". Ini dilakukan karena "HeroMagic" adalah subclass dari "Hero", sehingga dapat di-cast ke tipe "Hero".
        Hero heroMagicUp = (Hero) magicHero;
        // memanggil metode "display()" dari objek "heroMagicUp" yang sekarang sudah di-cast menjadi tipe "Hero".
        heroMagicUp.display();

        // melakukan casting objek "heroMagicUp" dari tipe "Hero" ke tipe "HeroMagic". Karena sebelumnya "heroMagicUp" sudah di-cast dari tipe "HeroMagic" ke tipe "Hero", maka mencoba dikembalikan ke tipe semula.
        HeroMagic magicHeroDown = (HeroMagic) heroMagicUp;
        // memanggil metode "display()" dari objek "magicHeroDown" yang sekarang sudah di-cast kembali menjadi tipe "HeroMagic".
        magicHeroDown.display(); 
    }
}
