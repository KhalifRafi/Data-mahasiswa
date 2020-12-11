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
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataMahasiswa d = new DataMahasiswa();
        d.tambahData(new DeskripsiMahasiswa("K3519057", "Muhammad", "16 September 2001", 0 ));
        d.tambahData(new DeskripsiMahasiswa("K3519000", "Khalif", "17 Maret 2000", 1));
        d.tambahData(new DeskripsiMahasiswa("K3519090", "Rafi", "18 Februari 2002", 0));
        
        
        System.out.println("----------Tampil Semua Data Mahasiswa----------");
        d.tampilData();
        
        
        System.out.println("\n");
        System.out.println("----------Cari Data----------");
        System.out.println("Dapat dengan nim atau jenis kelamin" + "\n");
        d.cariData(1);
        
        
        d.hapusData("K3519000");
        
        
        System.out.println("\n");
        System.out.println("----------Data Yang Terecord Setelah Perubahan----------");
        d.tampilData();
    }
    
}
