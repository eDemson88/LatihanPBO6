/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan hasil penjumlahan variabel
 *
 */
package pboif2.pkg10119078.latihan6.kambingstatic.konst;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan6KambingStaticKonst {
    public static int jumlahKambing;
}

public class KambingStatic{
    
    public static final String NAMA_KAMBING = "MIDUN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119078Latihan6KambingStaticKonst.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + PBOIF210119078Latihan6KambingStaticKonst.jumlahKambing);
    }
    
}
