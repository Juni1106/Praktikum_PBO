package Posttest6PBO;

public class EkstrakulikulerOlahraga extends Ekstrakulikuler implements Pembayaran {
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
        return hitungTotalBiaya(biayaPerPemain, jumlahPemain);
    }

    // Implementasi metode dari interface Pembayaran
    @Override
    public double hitungTotalBiaya(double biayaPerPemain, int jumlahPemain) {
        return biayaPerPemain * jumlahPemain;
    }

    // Implementasi metode dari interface Pembayaran
    @Override
    public double hitungTotalBiaya(double biayaTetap, double biayaPerAnggota, int jumlahAnggota) {
        // Tidak digunakan dalam kelas ini
        return 0;
    }

    // Metode lainnya...
}

