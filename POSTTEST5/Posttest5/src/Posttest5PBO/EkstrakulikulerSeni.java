// package Posttest5PBO;

// public class EkstrakulikulerSeni extends Ekstrakulikuler {
//     private String jenisSeni;

//     public EkstrakulikulerSeni(String nama, String deskripsi, String jenisSeni) {
//         super(nama, deskripsi);
//         this.jenisSeni = jenisSeni;
//     }

//     public String getJenisSeni() {
//         return jenisSeni;
//     }

//     public void setJenisSeni(String jenisSeni) {
//         this.jenisSeni = jenisSeni;
//     }

//     @Override
//     public void infoEkstrakulikuler() {
//         super.infoEkstrakulikuler();
//         System.out.println("Jenis Seni: " + jenisSeni);
//     }

//     // Overriding untuk tambahAnggota yang menerima array namaAnggota
//     public void tambahAnggota (String[] namaAnggota) {
//         for (String nama : namaAnggota) {
//             tambahAnggota(nama);
//         }
//     }
// }

package Posttest5PBO;

import java.util.ArrayList;

public class EkstrakulikulerSeni extends Ekstrakulikuler {
    private String jenisSeni;
    private double biayaTetap;
    private double biayaPerAnggota;

    public EkstrakulikulerSeni(String nama, String deskripsi, String jenisSeni, double biayaTetap, double biayaPerAnggota) {
        super(nama, deskripsi);
        this.jenisSeni = jenisSeni;
        this.biayaTetap = biayaTetap;
        this.biayaPerAnggota = biayaPerAnggota;
    }

    public String getJenisSeni() {
        return jenisSeni;
    }

    public void setJenisSeni(String jenisSeni) {
        this.jenisSeni = jenisSeni;
    }

    public double getBiayaTetap() {
        return biayaTetap;
    }

    public void setBiayaTetap(double biayaTetap) {
        this.biayaTetap = biayaTetap;
    }

    public double getBiayaPerAnggota() {
        return biayaPerAnggota;
    }

    public void setBiayaPerAnggota(double biayaPerAnggota) {
        this.biayaPerAnggota = biayaPerAnggota;
    }

    // Override metode hitungBiaya() dari kelas Ekstrakulikuler
    @Override
    public double hitungBiaya() {
        return biayaTetap + (jumlahAnggota() * biayaPerAnggota);
    }

    // Metode lainnya...
    @Override
    public void infoEkstrakulikuler() {
        super.infoEkstrakulikuler();
        System.out.println("Jenis Seni: " + jenisSeni);
        System.out.println("Biaya Tetap: " + biayaTetap);
        System.out.println("Biaya per Anggota: " + biayaPerAnggota);
    }
}
