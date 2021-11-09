package ukl_perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
        private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
        private ArrayList<Integer> idBuku = new ArrayList<Integer>();
        private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
        String key;
        boolean stay = true;

        Scanner set = new Scanner(System.in);

        public void Peminjaman(Siswa Siswa, Buku Buku, Peminjaman Peminjaman, Pengembalian pengembalian){        

        Siswa student = new Siswa();
        Buku book = new Buku();
        Laporan report = new Laporan();
        Petugas salary = new Petugas();
        Peminjaman rent = new Peminjaman();
        Pengembalian repay = new Pengembalian();
        
            //jika stay true maka akan tetap akan berjalan
            while(stay){    
                System.out.println("---- Aryo's Library ----");
                System.out.println("1. Status Siswa");
                System.out.println("2. Stok Buku");
                System.out.println("3. Peminjaman");
                System.out.println("4. Pengembalian");
                System.out.println("5. Exit");
                System.out.println("Pilih Menu: ");
                int menu = set.nextInt();

                if (menu == 1){
                    //menampilkan status siswa
                    System.out.println("Status Siswa");
                    System.out.println("ID \t Nama \t Status");
                    for(int i=0; i < Siswa.getJumlahSiswa();i++){                    
                        System.out.println(Siswa.getId(i) + "\t" +Siswa.getNama(i)+"\t"+Siswa.getStatus(i));
                    }

                }else if (menu == 2){
                    //menampilkan stok buku
                    System.out.println("Stok Buku");
                    for(int i = 0; i < Buku.getJumlahBuku(); i++){
                        System.out.println(Buku.getIdBuku(i)+"\t"+Buku.getJudulBuku(i)+"\t"+Buku.getStok(i));
                    }

                }else if(menu == 3){
                    
                    rent.prosesPeminjaman(Siswa, Peminjaman, Buku);

                }else if(menu == 4){
                    
                    repay.prosesPengembalian(Siswa, pengembalian, Buku);
                    
                }else if (menu == 5){
                    stay = false;
                }
            }
;
        }
    }