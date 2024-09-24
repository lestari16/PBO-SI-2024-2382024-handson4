public class ContohMethodStaticDanNonStatic {
    //method static untuk menghitung luas persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
     //method non-static untuk menampilakn pesan selamat datang
     public  void tampilkanPesanSelamatDatang(String nama) {
         System.out.println("Selamat datang, " + nama + "!");
     }

    public static void main(String[] args) {
        //memanggil methpd static langsung melalui nama kelas
        double luaspersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5; " + luaspersegi);

        //mmebuat objek dari kelas untuk memanggil method non static
        ContohMethodStaticDanNonStatic objek = new ContohMethodStaticDanNonStatic();
        objek.tampilkanPesanSelamatDatang(" john");
    }
}
