import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.ls.LSOutput;

public class ContohMethod {

    //Method untuk menghitung luas persegi
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;

    }

    public static void main(String[] args) {
        int sisi = 5;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegii dengan sisi " + sisi + " adalah " + luas);
    }
}
