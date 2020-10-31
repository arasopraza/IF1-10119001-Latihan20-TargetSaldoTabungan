import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan target saldo tabungan
 */

public class TargetSaldoTabungan {
    public static void main(String[] args) {
        int saldoAwal, lamaNabung, i;
        double bungaPerBulan;

        saldoAwal = 3500_000;
        bungaPerBulan = 0.08;
        lamaNabung = 8;
        i = 1;

        do {
            saldoAwal = (int) (saldoAwal + (saldoAwal * bungaPerBulan));
            NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id", "ID"));
            System.out.println("Saldo di bulan ke-" + i + " Rp." + numberFormat.format(saldoAwal));
            i++;
        } while (i <= lamaNabung);
    }
}
