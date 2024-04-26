// package Posttest5PBO;


// public class EkstrakulikulerOlahraga extends Ekstrakulikuler {
//     private int jumlahPemain;

//     public EkstrakulikulerOlahraga(String nama, String deskripsi, int jumlahPemain) {
//         super(nama, deskripsi);
//         this.jumlahPemain = jumlahPemain;
//     }

//     public int getJumlahPemain() {
//         return jumlahPemain;
//     }

//     public void setJumlahPemain(int jumlahPemain) {
//         this.jumlahPemain = jumlahPemain;
//     }

//     @Override
//     public void infoEkstrakulikuler() {
//         super.infoEkstrakulikuler();
//         System.out.println("Jumlah Pemain: " + jumlahPemain);
//     }

//     // Overloading untuk tambahAnggota yang menerima jumlahPemain dan namaAnggota
//     public void tambahAnggota(int jumlahPemain, String[] namaAnggota) {
//         if (namaAnggota.length <= jumlahPemain) {
//             for (String nama : namaAnggota) {
//                 tambahAnggota(nama);
//             }
//         } else {
//             System.out.println("Jumlah anggota melebihi kapasitas maksimum.");
//         }
//     }
// }

package Posttest5PBO;

import java.util.ArrayList;

public class EkstrakulikulerOlahraga extends Ekstrakulikuler {
    private int jumlahPemain;
    private double biayaPerPemain;

    public EkstrakulikulerOlahraga(String nama, String deskripsi, int jumlahPemain, double biayaPerPemain) {
        super(nama, deskripsi);
        this.jumlahPemain = jumlahPemain;
        this.biayaPerPemain = biayaPerPemain;
    }

    // Override metode hitungBiaya() dari kelas Ekstrakulikuler
    @Override
    public double hitungBiaya() {
        return jumlahPemain * biayaPerPemain;
    }

    // Metode lainnya...
    public int getJumlahPemain() {
        return jumlahPemain;
    }

    public void setJumlahPemain(int jumlahPemain) {
        this.jumlahPemain = jumlahPemain;
    }

    public double getBiayaPerPemain() {
        return biayaPerPemain;
    }

    public void setBiayaPerPemain(double biayaPerPemain) {
        this.biayaPerPemain = biayaPerPemain;
    }

    @Override
    public void infoEkstrakulikuler() {
        super.infoEkstrakulikuler();
        System.out.println("Jumlah Pemain: " + jumlahPemain);
        System.out.println("Biaya per Pemain: " + biayaPerPemain);
    }
}
