package ukl_perpustakaan;

public interface User {
    // Membuat abstrak method menggunakan class interface
    String getNama(int id);
    String getAlamat(int id);
    String getTelepon(int id);
    
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
}
