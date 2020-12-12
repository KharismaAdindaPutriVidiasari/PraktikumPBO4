/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataanmahasiswa;

/**
 *
 * @author User
 */
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Array {
     ArrayList<String> NM = new ArrayList<>();
    ArrayList<String> NMA = new ArrayList<>();
    ArrayList<Date> Tglhr = new ArrayList<>();
    ArrayList<Integer> Jklmn = new ArrayList<>();
    Scanner inputData = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    void tambah(){
        String nim,nama;
        Integer gender;
        int tahun,hari,bulan;
        
        System.out.println("Masukkan Jumlahnya Data:");
        inputData.nextLine();
        System.out.print("  NIM: ");
        nim = inputData.nextLine();
        System.out.print("  Nama: ");
        nama = inputData.nextLine();
        System.out.println("  Tanggal Lahir (dd/mm/yyyy): ");
        System.out.print("  #Tanggal : ");
        hari = inputData.nextInt();
        System.out.print("  #Bulan : ");
        bulan = inputData.nextInt();
        System.out.print("  #Tahun : ");
        tahun = inputData.nextInt();
        Date tanggal = new GregorianCalendar(tahun, bulan - 1, hari).getTime();
        System.out.print("  Jenis Kelamin (0:Perempuan 1:Laki-laki): ");
        gender = inputData.nextInt();
        NM.add(nim);
        NMA.add(nama);
        Tglhr.add(tanggal);
        Jklmn.add(gender);   
    }
    
    void hapus(){
        if(NM.size() > 0){
            System.out.print("Masukkan NIM: ");
            String terhapus = inputData.nextLine();
            inputData.nextLine();
            int index = NM.indexOf(terhapus);
            if(index < 0){
                System.out.println("");
                System.out.println("------+++++++++++++--------");
                System.out.println("DATA TIDAK ADA YANG SESUAI.");
                System.out.println("+++++++############++++++++");
                System.out.println("");
            }else{
                NM.remove(index);
                NMA.remove(index);
                Tglhr.remove(index);
                Jklmn.remove(index);
                System.out.println("");
                System.out.println("------+++++++++++++--------");
                System.out.println("DATA TELAH SUKSES DIHAPUS.");
                System.out.println("+++++++############++++++++");
                System.out.println("");
            }
        }else{
            System.out.println("");
            System.out.println("------+++++++++++++--------");
            System.out.println("TIDAK ADA DATA YANG DICARI.");
            System.out.println("+++++++############++++++++");
            System.out.println("");
        }  
    }
    
    void cari(){
        System.out.println("Pencarian Menurut : ");
        System.out.println("    1. NIM");
        System.out.println("    2. Jenis Kelamin");
        System.out.print("  Masukkan Pilihanmu: ");
        int pilihan = inputData.nextInt();
        switch(pilihan){
            case 1:
                inputData.nextLine();
                System.out.print("  Masukkan NIM Yang dituju : ");
                String dicari = inputData.nextLine();
                for(String n: NM){
                    if(NM.contains(dicari)){
                        int index = NM.indexOf(dicari);
                        String tanggalah = formatter.format(Tglhr.get(index));
                        String jenisKel = (Jklmn.get(index) == 0) ? "Perempuan" : "Laki-laki";
                        System.out.println("");
                        System.out.println("------+++++++++++++--------");
                        System.out.println("Mahasiswa NIM " + NM.get(index));
                        System.out.println("======+-+-+-+-+-+-========");
                        System.out.println("NIM : " + NM.get(index));
                        System.out.println("NMA : " + NMA.get(index));
                        System.out.println("Tanggal Lahir : " + tanggalah);
                        System.out.println("Jenis Kelamin : " + jenisKel);
                        System.out.println("+++++++############++++++++");
                        System.out.println("");
                        break;
                    }
                }
                break;
            case 2:
                inputData.nextLine();
                System.out.print("  Masukkan Jenis Kelamin(0:Perempuan 1:Laki-laki):");
                int dicari2 = inputData.nextInt();
                for(int n = 0; n < Jklmn.size(); n++){
                    if(Jklmn.get(n) == dicari2){
                        String tanggalah = formatter.format(Tglhr.get(n));
                        String jenisKel = (Jklmn.get(n) == 0) ? "Perempuan" : "Laki-laki";
                        System.out.println("");
                        System.out.println("------+++++++++++++--------");
                        System.out.println("Data Berdasarkan Jenis Kelamin");
                        System.out.println("======+-+-+-+-+-+-========");
                        System.out.println("NIM : " + this.NM.get(n));
                        System.out.println("NMA : " + this.NMA.get(n));
                        System.out.println("Tanggal Lahir : " + tanggalah);
                        System.out.println("Jenis Kelamin : " + jenisKel);
                        System.out.println("+++++++############++++++++");
                        System.out.println("");
                    }
                };
                break;
            default:
                System.out.println("");
                System.out.println("------+++++++++++++--------");
                System.out.println("Menu Yang Anda Pilih Tidak Ada.");
                System.out.println("+++++++############++++++++");
                System.out.println("");
        }
        
    }
    
    void tampilkan(){
        if(NM.size() == 0){
            System.out.println("");
            System.out.println("------+++++++++++++--------");
            System.out.println("TIDAK ADA DATA YANG DISIMPAN.");
            System.out.println("+++++++############++++++++");
            System.out.println("");
        }else{
            for(int n = 0; n < NM.size(); n++){
                String tanggalah = formatter.format(Tglhr.get(n));
                String jenisKel = (Jklmn.get(n) == 0) ? "Perempuan" : "Laki-laki";
                System.out.println("");
                System.out.println("------+++++++++++++--------");
                System.out.println("    Mahasiswa ke " + (n+1));
                System.out.println("======*************========");
                System.out.println("NIM : " + NM.get(n));
                System.out.println("NMA : " + NMA.get(n));
                System.out.println("Tanggal : " + tanggalah);
                System.out.println("Jenis Kelamin : " + jenisKel);
                System.out.println("+++++++############++++++++");
            }
            System.out.println("Jumlah Mahasiswa Yang dimasukkan : " + NM.size() +"\n\n");
        }
        
    }
}
