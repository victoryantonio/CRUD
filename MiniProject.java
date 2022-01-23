import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
public class MiniProject {
	private static int no;
	private static int index;
	private static String nama;
	private static String nim;
	private static String hapus;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner hallo = new Scanner(System.in);

		ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
		daftarMahasiswa.add(new Mahasiswa("JESSIKA OVA NATHASYA","622018002"));
		daftarMahasiswa.add(new Mahasiswa("JEREMI SITANGGANG","622018015"));
		daftarMahasiswa.add(new Mahasiswa("ANTONIO VICTORI SEMBIRING","622019014"));
		daftarMahasiswa.add(new Mahasiswa("ANUGRAH IGO WIBOWO","622019017"));
		
		do {
		System.out.println("Menu");
		System.out.println("1. Buat Data");
		System.out.println("2. Lihat Data");
		System.out.println("3. Hapus Data");
		System.out.println("4. Keluar");
		System.out.print("Pilihan: ");
		no = scan.nextInt();
		if (no == 1) {
			System.out.println("Tambah Mahasiswa");
			
			System.out.print("Nama: ");
			nama = hallo.nextLine();
			
			System.out.print("NIM: ");
			try {
				nim = hallo.nextLine();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			daftarMahasiswa.add(new Mahasiswa(nama,nim));
			
		}
		else if(no == 2) {
			System.out.println("Lihat: ");
			for(int i=0;i<daftarMahasiswa.size(); i++) 
			{
					Mahasiswa mhs = daftarMahasiswa.get(i);
					System.out.println(i+1 +". "+mhs.getNama()+" : "+mhs.getNim());
			}
		}
		else if (no == 3) {
			System.out.println("Nama/NIM yang akan dihapus: ");
			hapus = hallo.nextLine();
			for(int i=0;i<daftarMahasiswa.size(); i++)
			{
					Mahasiswa mhs = daftarMahasiswa.get(i);
					if (mhs.getNama().toUpperCase().contains(hapus.toUpperCase()) == true){
						index = i;
						break;
					}
					else if(mhs.getNim().toUpperCase().contains(hapus.toUpperCase()) == true){
						index = i;
						break;
					}
					else {
						
					}
			} 
			daftarMahasiswa.remove(index);
		}
		else if (no ==4) {
			System.exit(1);
		}
		} 
		while (true);
	}


	}


