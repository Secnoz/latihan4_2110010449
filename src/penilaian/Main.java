/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir aan = new NilaiAkhir("Muhammad Anshari","2110010449",90,90,95);
        
        System.out.println("Nama : " + aan.getNama());
        System.out.println("NPM : " + aan.getNpm());
        System.out.println("Nilai Akhir : " + aan.hitungNilaiAkhir());
    }
    
}
