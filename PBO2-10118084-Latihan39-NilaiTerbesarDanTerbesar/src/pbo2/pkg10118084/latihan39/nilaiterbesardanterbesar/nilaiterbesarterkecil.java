/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan39.nilaiterbesardanterbesar;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan niali terbesar dan terkecil

 */
public class nilaiterbesarterkecil {
    int Banyakmahasiswa;
    int i;
    int nilai;
   public void hitungnilai(){
      Scanner Scanner = new Scanner (System.in);
        
        
        System.out.print("Masukkan Banyaknya Mahasiswa :");  
        Banyakmahasiswa=Scanner.nextInt();
        int nilai[] = new int[Banyakmahasiswa];
        for (i = 1; i <= Banyakmahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" :");
            nilai[i-1] = Scanner.nextInt();
        }
        System.out.println("====Hasil Nilai Mahasiswa===== ");  
        for (i = 1; i <= Banyakmahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-"+i+" :"+nilai[i-1]);
                    }
        Arrays.sort(nilai);
        System.out.println("Nilai Terbesar " + nilai[1]);
        System.out.println("Nilai Terkecil " + nilai[0]);
   }
}
