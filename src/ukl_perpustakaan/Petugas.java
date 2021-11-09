package ukl_perpustakaan;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<Integer> idPetugas = new ArrayList<Integer>();
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas() {
        this.idPetugas.add(0);
        this.namaPetugas.add("Widya");
        this.alamat.add("Blitar");
        this.telepon.add("087704080404");
        
    }

    @Override
    public String getNama(int idPetugas) {
        return this.getNama(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.getAlamat(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.getTelepon(idPetugas);
    }
    
    public int getId(int idPetugas){
        return this.idPetugas.get(idPetugas);
    }                   

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public int getJumlahPetugas(){
        return this.idPetugas.size();
    }
    
    
}
