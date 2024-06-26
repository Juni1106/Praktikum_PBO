package Posttest4PBO;

public class EkstrakulikulerSeni extends Ekstrakulikuler {
    private String jenisSeni;

    public EkstrakulikulerSeni(String nama, String deskripsi, String jenisSeni) {
        super(nama, deskripsi);
        this.jenisSeni = jenisSeni;
    }

    public String getJenisSeni() {
        return jenisSeni;
    }

    public void setJenisSeni(String jenisSeni) {
        this.jenisSeni = jenisSeni;
    }

    @Override
    public void infoEkstrakulikuler() {
        super.infoEkstrakulikuler();
        System.out.println("Jenis Seni: " + jenisSeni);
    }

    // Overriding untuk tambahAnggota yang menerima array namaAnggota
    public void tambahAnggota (String[] namaAnggota) {
        for (String nama : namaAnggota) {
            tambahAnggota(nama);
        }
    }
}
