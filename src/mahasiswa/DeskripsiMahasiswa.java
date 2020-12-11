/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author LENOVO
 */
public class DeskripsiMahasiswa {
    String nim;
    String nama;
    String tglLahir;
    int gender;
    
    DeskripsiMahasiswa(String nm, String nma, String tgl, int jk){
        this.nim = nm;
        this.nama = nma;
        this.tglLahir = tgl;
        this.gender = jk;
    }
    
    void print(){
        System.out.println("nim mahasiswa: " + this.nim);
        System.out.println("nama mahasiswa: " + this.nama);
        System.out.println("tanggal lahir mahasiswa: " + this.tglLahir);
        System.out.println("jenis kelamin mahasiswa: " + this.gender);
    }
}
