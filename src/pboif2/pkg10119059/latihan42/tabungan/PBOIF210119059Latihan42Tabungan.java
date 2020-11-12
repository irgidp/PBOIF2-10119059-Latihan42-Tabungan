/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Tabungan
 */
package pboif2.pkg10119059.latihan42.tabungan;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;

public class PBOIF210119059Latihan42Tabungan {

    public static void main(String[] args) {
        int jumlah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tab = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = tab.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : "+jumlah);
    }
    
}
