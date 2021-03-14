import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class TP1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah KWH : ");
        int angka = input.nextInt();
        // biaya adalah total biaya yang harus dibayarkan
        double biaya, temp;

        if (angka <= 100){
            biaya = angka * 1500;
        } else {
            // variabel temp digunakan untuk menyimpan jumlah pemakaian / KWH yang lebih dari 100
            temp = angka - 100;
            biaya = (100 * 1500) + (temp * 1200);
        }
        Locale idn_local = new Locale("in", "ID");
        NumberFormat IDR = NumberFormat.getCurrencyInstance(idn_local);
        System.out.println("Total Tagihan: " + IDR.format(biaya));
    }
}
