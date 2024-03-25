package Posttest3PBO;

// EkstrakulikulerOlahraga.java
public class EkstrakulikulerOlahraga extends Ekstrakulikuler {
    private int jumlahPemain;

    public EkstrakulikulerOlahraga(String nama, String deskripsi, int jumlahPemain) {
        super(nama, deskripsi);
        this.jumlahPemain = jumlahPemain;
    }

    public int getJumlahPemain() {
        return jumlahPemain;
    }

    public void setJumlahPemain(int jumlahPemain) {
        this.jumlahPemain = jumlahPemain;
    }

    @Override
    public void infoEkstrakulikuler() {
        super.infoEkstrakulikuler();
        System.out.println("Jumlah Pemain: " + jumlahPemain);
    }
}
