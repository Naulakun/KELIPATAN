/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author 
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : TAMPILKAN BILANGAN KELIPATA 3,5 DIMULAI DARI 3,5 - 35 
 */
public class SOAL2 {
    public static void main(String[] args) {
        System.out.println("Bilangan keliatan 3,5 dimulai dari 3,5 sampai 35:");
        double angka = 3.5;
        while (angka <= 35){
            System.out.println(angka);
            angka += 3.5;
        }
    }
}
