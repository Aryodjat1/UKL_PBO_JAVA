package ukl_perpustakaan;

import java.util.ArrayList;

public class Siswa implements User{
    //membuat ArrayList 
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    // Set data Siswa
    public void Siswa(){
        this.idSiswa.add(0);
        this.namaSiswa.add("Aryo");
        this.alamat.add("Nganjuk");
        this.telepon.add("08973452597");
        this.status.add(true);
        
        this.idSiswa.add(1);
        this.namaSiswa.add("Erina");
        this.alamat.add("Nganjuk");
        this.telepon.add("08123452597");
        this.status.add(true);
        
        
    }
    // method menambah nilai array status
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    // method untuk menentukan status siswa
    public String getStatus(int idSiswa){
        if(this.status.get(idSiswa)){
            return ("Anda Diizinkan Meminjam Buku");
        }else{
            return ("Anda Tidak Diizinkan Meminjam Buku");
        }
    }

    //method untuk mengambil nilai dari status
    public boolean isStatus(int idSiswa){
        return status.get(idSiswa);
    }
    
    //method untuk mengakses isi dari array namaSiswa
    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    //method untuk mengakses isi dari array alamat
    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    //method untuk mengakses isi dari array telepon
    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }

    //
    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public int getJumlahSiswa(){
        return this.namaSiswa.size();
    }
    
    public int getId(int idSiswa){
        return this.idSiswa.get(idSiswa);
    }
    
    //method untuk mengedit isi dari array dengan index menurut idSiswa
    public void editStatus(int idSiswa, boolean status){
        this.status.set(idSiswa, status);            
    }
 }
