public class ContohParameterMethod {

    public static int kalidua(int angka) {
        int hasil = angka * 2;
        System.out.println("Hasil : " + hasil);

    }

    public static double hitungSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        int hasilKaliDua = kalidua(  5 );// memanggil method dengan argumen 5
        System.out.println("5 x 2 = " + hasilKaliDua);

        double luasSegitiga = hitungSegitiga(  4,  6);//memanggil method dengan argumen 4 dan 6
        System.out.println("Luas segitiga; " + luasSegitiga);
    }
}
