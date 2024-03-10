package Posttest1PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Ekstrakulikuler> ekstrakulikulerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Ekstrakulikuler");
            System.out.println("2. Hapus Ekstrakulikuler");
            System.out.println("3. Update Deskripsi Ekstrakulikuler");
            System.out.println("4. Tambah Anggota Ekstrakulikuler");
            System.out.println("5. Hapus Anggota Ekstrakulikuler");
            System.out.println("6. Lihat Data Ekstrakulikuler");
            System.out.println("7. Keluar");
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
        Ekstrakulikuler ekstrakulikuler = new Ekstrakulikuler(nama, deskripsi);
        ekstrakulikulerList.add(ekstrakulikuler);
        System.out.println("Ekstrakulikuler berhasil ditambahkan.");
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
        System.out.println("Ekstrakulikuler tidak ditemukan.");
    }

    private static void lihatEkstrakulikuler() {
        System.out.println("=== Data Ekstrakulikuler ===");
        for (Ekstrakulikuler ekstrakulikuler : ekstrakulikulerList) {
            ekstrakulikuler.infoEkstrakulikuler();
            System.out.println();
        }
    }
}
