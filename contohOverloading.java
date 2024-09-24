public class contohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }
    //Method untuk menghitung luas persegi panjang
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
    //Method untuk menghitung luas lingkaran
    public static double hitungLuas(double jariJari, boolean isLingkaran) {
        if (isLingkaran){
            return Math.PI * jariJari * jariJari;
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {

    }

    }

