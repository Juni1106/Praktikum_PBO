// package Posttest5PBO;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class App {
//     private static ArrayList<Ekstrakulikuler> ekstrakulikulerList = new ArrayList<>();
//     private static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         boolean exit = false;
//         do {
//             System.out.println("=================== MENU ==================");
//             System.out.println("*******************************************");
//             System.out.println(" || 1. Tambah Ekstrakulikuler           || ");
//             System.out.println(" || 2. Hapus Ekstrakulikuler            || ");
//             System.out.println(" || 3. Update Deskripsi Ekstrakulikuler || ");
//             System.out.println(" || 4. Tambah Anggota Ekstrakulikuler   || ");
//             System.out.println(" || 5. Hapus Anggota Ekstrakulikuler    || ");
//             System.out.println(" || 6. Lihat Data Ekstrakulikuler       || ");
//             System.out.println(" || 7. Keluar                           || ");
//             System.out.println("===========================================");
//             System.out.print("Pilih menu: ");
            
//             int choice = scanner.nextInt();
//             scanner.nextLine(); // consume newline

//             switch (choice) {
//                 case 1:
//                     tambahEkstrakulikuler();
//                     break;
//                 case 2:
//                     hapusEkstrakulikuler();
//                     break;
//                 case 3:
//                     updateDeskripsiEkstrakulikuler();
//                     break;
//                 case 4:
//                     tambahAnggota();
//                     break;
//                 case 5:
//                     hapusAnggota();
//                     break;
//                 case 6:
//                     lihatEkstrakulikuler();
//                     break;
//                 case 7:
//                     exit = true;
//                     System.out.println("Program berhenti.");
//                     break;
//                 default:
//                     System.out.println("Pilihan tidak valid.");
//             }
//         } while (!exit);
//     }

//     private static void tambahEkstrakulikuler() {
//         System.out.print("Masukkan nama ekstrakulikuler: ");
//         String nama = scanner.nextLine();
//         System.out.print("Masukkan deskripsi ekstrakulikuler: ");
//         String deskripsi = scanner.nextLine();
//         System.out.print("Masukkan jenis (olahraga/seni): ");
//         String jenis = scanner.nextLine();
//         if (jenis.equalsIgnoreCase("olahraga")) {
//             System.out.print("Masukkan jumlah pemain: ");
//             int jumlahPemain = scanner.nextInt();
//             EkstrakulikulerOlahraga ekstrakulikuler = new EkstrakulikulerOlahraga(nama, deskripsi, jumlahPemain);
//             ekstrakulikulerList.add(ekstrakulikuler);
//             System.out.println("Ekstrakulikuler olahraga berhasil ditambahkan.");
//         } else if (jenis.equalsIgnoreCase("seni")) {
//             System.out.print("Masukkan jenis seni: ");
//             String jenisSeni = scanner.nextLine();
//             EkstrakulikulerSeni ekstrakulikuler = new EkstrakulikulerSeni(nama, deskripsi, jenisSeni);
//             ekstrakulikulerList.add(ekstrakulikuler);
//             System.out.println("Ekstrakulikuler seni berhasil ditambahkan.");
//         } else {
//             System.out.println("Jenis ekstrakulikuler tidak valid.");
//         }
//     }

//     private static void hapusEkstrakulikuler() {
//         System.out.print("Masukkan nama ekstrakulikuler yang ingin dihapus: ");
//         String nama = scanner.nextLine();
//         for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
//             if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
//                 ekstrakulikulerList.remove(ekstrakulikuler);
//                 System.out.println("Ekstrakulikuler berhasil dihapus.");
//                 return;
//             }
//         }
//         System.out.println("Ekstrakulikuler tidak ditemukan.");
//     }

//     private static void updateDeskripsiEkstrakulikuler() {
//         System.out.print("Masukkan nama ekstrakulikuler yang ingin diupdate: ");
//         String nama = scanner.nextLine();
//         for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
//             if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
//                 System.out.print("Masukkan deskripsi baru: ");
//                 String deskripsi = scanner.nextLine();
//                 ekstrakulikuler.setDeskripsi(deskripsi);
//                 System.out.println("Deskripsi ekstrakulikuler berhasil diupdate.");
//                 return;
//             }
//         }
//         System.out.println("Ekstrakulikuler tidak ditemukan.");
//     }

//     private static void tambahAnggota() {
//         System.out.print("Masukkan nama ekstrakulikuler: ");
//         String nama = scanner.nextLine();
//         for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
//             if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
//                 System.out.print("Masukkan nama anggota: ");
//                 String namaAnggota = scanner.nextLine();
//                 ekstrakulikuler.tambahAnggota(namaAnggota);
//                 System.out.println("Anggota berhasil ditambahkan.");
//                 return;
//             }
//         }
//         System.out.println("Ekstrakulikuler tidak ditemukan.");
//     }

//     private static void hapusAnggota() {
//         System.out.print("Masukkan nama ekstrakulikuler: ");
//         String nama = scanner.nextLine();
//         for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
//             if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
//                 System.out.print("Masukkan nama anggota yang ingin dihapus: ");
//                 String namaAnggota = scanner.nextLine();
//                 ekstrakulikuler.hapusAnggota(namaAnggota);
//                 System.out.println("Anggota berhasil dihapus.");
//                 return;
//             }
//         }
//         System.out.println("Ekstrakulikuler yang dicari tidak ditemukan.");
//     }

//     private static void lihatEkstrakulikuler() {
//         System.out.println("=========== DATA EKSTRAKULIKULER ==========");
//         for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
//             ekstrakulikuler.infoEkstrakulikuler();
//             System.out.println("===========================================");

//             System.out.println();
//         }
//     }
// }



package Posttest5PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Ekstrakulikuler> ekstrakulikulerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println("=================== MENU ==================");
            System.out.println("*******************************************");
            System.out.println(" || 1. Tambah Ekstrakulikuler           || ");
            System.out.println(" || 2. Hapus Ekstrakulikuler            || ");
            System.out.println(" || 3. Update Deskripsi Ekstrakulikuler || ");
            System.out.println(" || 4. Tambah Anggota Ekstrakulikuler   || ");
            System.out.println(" || 5. Hapus Anggota Ekstrakulikuler    || ");
            System.out.println(" || 6. Lihat Data Ekstrakulikuler       || ");
            System.out.println(" || 7. Keluar                           || ");
            System.out.println("===========================================");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tambahEkstrakulikuler();
                    break;
                case 2:
                    hapusEkstrakulikuler();
                    break;
                case 3:
                    updateDeskripsiEkstrakulikuler();
                    break;
                case 4:
                    tambahAnggota();
                    break;
                case 5:
                    hapusAnggota();
                    break;
                case 6:
                    lihatEkstrakulikuler();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Program berhenti.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (!exit);
    }

    private static void tambahEkstrakulikuler() {
        System.out.print("Masukkan nama ekstrakulikuler: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan deskripsi ekstrakulikuler: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Masukkan jenis (olahraga/seni): ");
        String jenis = scanner.nextLine();
        if (jenis.equalsIgnoreCase("olahraga")) {
            System.out.print("Masukkan jumlah pemain: ");
            int jumlahPemain = scanner.nextInt();
            System.out.print("Masukkan biaya per pemain: ");
            double biayaPerPemain = scanner.nextDouble();
            EkstrakulikulerOlahraga ekstrakulikuler = new EkstrakulikulerOlahraga(nama, deskripsi, jumlahPemain, biayaPerPemain);
            ekstrakulikulerList.add(ekstrakulikuler);
            System.out.println("Ekstrakulikuler olahraga berhasil ditambahkan.");
        } else if (jenis.equalsIgnoreCase("seni")) {
            System.out.print("Masukkan jenis seni: ");
            String jenisSeni = scanner.nextLine();
            System.out.print("Masukkan biaya tetap: ");
            double biayaTetap = scanner.nextDouble();
            System.out.print("Masukkan biaya per anggota: ");
            double biayaPerAnggota = scanner.nextDouble();
            EkstrakulikulerSeni ekstrakulikuler = new EkstrakulikulerSeni(nama, deskripsi, jenisSeni, biayaTetap, biayaPerAnggota);
            ekstrakulikulerList.add(ekstrakulikuler);
            System.out.println("Ekstrakulikuler seni berhasil ditambahkan.");
        } else {
            System.out.println("Jenis ekstrakulikuler tidak valid.");
        }
    }

    private static void hapusEkstrakulikuler() {
        System.out.print("Masukkan nama ekstrakulikuler yang ingin dihapus: ");
        String nama = scanner.nextLine();
        for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
            if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
                ekstrakulikulerList.remove(ekstrakulikuler);
                System.out.println("Ekstrakulikuler berhasil dihapus.");
                return;
            }
        }
        System.out.println("Ekstrakulikuler tidak ditemukan.");
    }

    private static void updateDeskripsiEkstrakulikuler() {
        System.out.print("Masukkan nama ekstrakulikuler yang ingin diupdate: ");
        String nama = scanner.nextLine();
        for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
            if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan deskripsi baru: ");
                String deskripsi = scanner.nextLine();
                ekstrakulikuler.setDeskripsi(deskripsi);
                System.out.println("Deskripsi ekstrakulikuler berhasil diupdate.");
                return;
            }
        }
        System.out.println("Ekstrakulikuler tidak ditemukan.");
    }

    private static void tambahAnggota() {
        System.out.print("Masukkan nama ekstrakulikuler: ");
        String nama = scanner.nextLine();
        for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
            if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan nama anggota: ");
                String namaAnggota = scanner.nextLine();
                ekstrakulikuler.tambahAnggota(namaAnggota);
                System.out.println("Anggota berhasil ditambahkan.");
                return;
            }
        }
        System.out.println("Ekstrakulikuler tidak ditemukan.");
    }

    private static void hapusAnggota() {
        System.out.print("Masukkan nama ekstrakulikuler: ");
        String nama = scanner.nextLine();
        for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
            if (ekstrakulikuler.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan nama anggota yang ingin dihapus: ");
                String namaAnggota = scanner.nextLine();
                ekstrakulikuler.hapusAnggota(namaAnggota);
                System.out.println("Anggota berhasil dihapus.");
                return;
            }
        }
        System.out.println("Ekstrakulikuler yang dicari tidak ditemukan.");
    }

    private static void lihatEkstrakulikuler() {
        System.out.println("=========== DATA EKSTRAKULIKULER ==========");
        for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
            ekstrakulikuler.infoEkstrakulikuler();
            System.out.println("===========================================");

            System.out.println();
        }
    }
}
