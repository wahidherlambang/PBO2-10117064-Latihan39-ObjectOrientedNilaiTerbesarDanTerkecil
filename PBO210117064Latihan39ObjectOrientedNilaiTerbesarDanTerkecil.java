/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan39.objectorientednilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * nilai terbesar dan nilai terkecil.
 */
public class PBO210117064Latihan39ObjectOrientedNilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaftarNilai Nilai = new DaftarNilai();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan "
                + "Terkecil Nilai Mahasiswa=====");
        Scanner ptgs = new Scanner (System.in);
        System.out.print("Masukkan nama petugas\t: ");
        String nama = ptgs.nextLine();
        
        Nilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<Nilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            Nilai.nilaiMhs[i] = scn.nextInt();
            Nilai.hitungNilaiTerbesar(i);
            Nilai.hitungNilaiTerkecil(i);
        }
        Nilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+Nilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+Nilai.nKecil);

        System.out.print("\nPetugas : " + nama);
    }
}