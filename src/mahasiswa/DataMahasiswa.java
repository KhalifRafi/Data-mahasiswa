/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class DataMahasiswa {
    ArrayList<DeskripsiMahasiswa>dataMahasiswa = new ArrayList<DeskripsiMahasiswa>();
    
    void tambahData(DeskripsiMahasiswa data){
        this.dataMahasiswa.add(data);
    }
    void hapusData(String nm){
        this.dataMahasiswa.removeIf(item -> item.nim == nm);
    }
    void cariData(String nm){
        boolean ditemukan = false;
        int index = -1;
        for(int i = 0; i < this.dataMahasiswa.size(); i++){
            if(this.dataMahasiswa.get(i).nim == nm){
                index = i;
                ditemukan = true;
            }
        }
        if (ditemukan == true){
            this.dataMahasiswa.get(index).print();
        }else{
            System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
    void cariData(int jk){
        boolean ditemukan = false;
        int index = -1;
        for(int i = 0; i < this.dataMahasiswa.size(); i++){
            if(this.dataMahasiswa.get(i).gender == jk){
                index = i;
                ditemukan = true;
            }
        }
        if (ditemukan == true){
            this.dataMahasiswa.get(index).print();
        }else{
            System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
    void tampilData(){
        for(DeskripsiMahasiswa item: this.dataMahasiswa){
            item.print();
        }
    }
}
