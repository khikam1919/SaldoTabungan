/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan19.saldotabungan;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini berisi untuk menghitung dan menampilkan saldo tabungan 
 * setiap bulan selama 6 bulan dengan bunga 15% per bulan,dimulai dari saldo awal Rp 2.500.000
 */
public class SI23176014Latihan19SaldoTabungan {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 2500000; // Saldo awal sebesar Rp 2.500.000
        double bunga = 0.15;        // Bunga per bulan sebesar 15% atau 0.15
        int lama = 6;               // Lama tabungan dalam bulan (6 bulan)
        
        // Perhitungan saldo setiap bulan
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}