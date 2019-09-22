package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mendeklarasi dan mendeskripsikan variabel integer sesuai dengan ukuran yang dapat ditampungnya.
 *                        Mengakses variabel dan menampilkannya di layar.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        
        b = 127;
        s = 32767;
        i = 1000_000_000;
        l = 90000000000L;
        
        System.out.println("byte\t: " + b);
        System.out.println("short\t: " + s);
        System.out.println("int\t: " + i);
        System.out.println("long\t: " + l);
    }
    
}
