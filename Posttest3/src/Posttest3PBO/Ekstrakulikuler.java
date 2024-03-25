package Posttest3PBO;


import java.util.ArrayList;
import java.util.Scanner;

public class Ekstrakulikuler {
    private String nama;
    private String deskripsi;
    private ArrayList<String> anggota;

    public Ekstrakulikuler(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.anggota = new ArrayList<>();
    }

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Menambahkan anggota ke dalam ekstrakulikuler
    public void tambahAnggota(String namaAnggota) {
        anggota.add(namaAnggota);
    }

    // Menghapus anggota dari ekstrakulikuler
    public void hapusAnggota(String namaAnggota) {
        anggota.remove(namaAnggota);
    }

    // Mendapatkan daftar anggota ekstrakulikuler
    public ArrayList<String> getAnggota() {
        return anggota;
    }

    // Mengambil jumlah anggota ekstrakulikuler
    public int jumlahAnggota() {
        return anggota.size();
    }

    // Menampilkan informasi lengkap tentang ekstrakulikuler
    public void infoEkstrakulikuler() {
        System.out.println("Nama: " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Jumlah Anggota: " + jumlahAnggota());
        System.out.println("Daftar Anggota:");
        for (String anggota : anggota) {
            System.out.println("- " + anggota);
        }
    }
}
