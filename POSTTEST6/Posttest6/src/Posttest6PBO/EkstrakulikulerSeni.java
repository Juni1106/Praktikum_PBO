package Posttest6PBO;

public class EkstrakulikulerSeni extends Ekstrakulikuler implements Pembayaran {
    private double biayaTetap;
    private double biayaPerAnggota;

    public EkstrakulikulerSeni(String nama, String deskripsi, String jenisSeni, double biayaTetap, double biayaPerAnggota) {
        super(nama, deskripsi);
        this.biayaTetap = biayaTetap;
        this.biayaPerAnggota = biayaPerAnggota;
    }

    // Override metode hitungBiaya() dari kelas Ekstrakulikuler
    @Override
    public double hitungBiaya() {
        return hitungTotalBiaya(biayaTetap, biayaPerAnggota, jumlahAnggota());
    }

    // Implementasi metode dari interface Pembayaran
    @Override
    public double hitungTotalBiaya(double biayaTetap, double biayaPerAnggota, int jumlahAnggota) {
        return biayaTetap + (biayaPerAnggota * jumlahAnggota);
    }

    // Implementasi metode dari interface Pembayaran
    @Override
    public double hitungTotalBiaya(double biayaPerPemain, int jumlahPemain) {
        // Tidak digunakan dalam kelas ini
        return 0;
    }

}
