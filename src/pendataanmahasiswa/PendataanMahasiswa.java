/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataanmahasiswa;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PendataanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        boolean menu = true;
        int pilihMenu;
        Array mhsw = new Array();
        
        
        while(menu){
            System.out.println("");
            System.out.println("======************========");
            System.out.println("Data Mahasiswa HMP");
            System.out.println("+++++++############++++++++");
            System.out.println("Pilihan Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihMenu = input.nextInt();
            switch(pilihMenu){
                case 1:
                    char ulang = 'y';
                    while(ulang == 'y'){
                        mhsw.tambah();
                        System.out.print("  Apakah ingin menambah lagi? (y/n): ");
                        ulang = input.next().charAt(0);
                    }
                    break;
                case 2:
                    mhsw.hapus();
                    break;
                case 3:
                    mhsw.cari();
                    break;
                case 4:
                    mhsw.tampilkan();
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("======************========");
                    System.out.println("MENU YANG ANDA TUJU TIDAK TERSEDIA.");
                    System.out.println("+++++++############++++++++");
            }
                    
        }
    }
    
}
