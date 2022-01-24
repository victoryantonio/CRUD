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
	private static String edit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Scanner hallo = new Scanner(System.in);

		ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
		daftarMahasiswa.add(new Mahasiswa("JESSIKA OVA NATHASYA","622018002"));
		daftarMahasiswa.add(new Mahasiswa("JEREMI SITANGGANG","622018015"));
		daftarMahasiswa.add(new Mahasiswa("ANTONIO VICTORI SEMBIRING","622019014"));
		daftarMahasiswa.add(new Mahasiswa("ANUGRAH IGO ALDI WIBOWO","622019017"));
		
		do {
		System.out.println("\nMenu");
		System.out.println("1. Buat Data");
		System.out.println("2. Lihat Data");
		System.out.println("3. Update/Edit Data");
		System.out.println("4. Hapus Data");
		System.out.println("5. Keluar");
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
		else if(no == 3) {
			System.out.println("Nama/NIM yang akan diedit: ");
			edit = hallo.nextLine();
			for(int i = 0; i < daftarMahasiswa.size(); i++)
			{
				Mahasiswa mhs = daftarMahasiswa.get(i);
				if (mhs.getNama().toUpperCase().contains(edit.toUpperCase()) == true){
					index = i;
					System.out.println("1. Edit Nama");
					System.out.println("2. Edit NIM");
					System.out.println("Pilihan: ");
					no = scan.nextInt();
					
					if(no == 1)
					{
						System.out.println("Masukkan Nama Baru: ");
						nama = hallo.nextLine();
						nim = mhs.getNim();
					}
					else if(no == 2)
					{
						System.out.println("Masukkan NIM Baru: ");
						nim = hallo.nextLine();
						nama = mhs.getNama();
					}
					break;
				}
				
				else if(mhs.getNim().toUpperCase().contains(edit.toUpperCase()) == true){
					index = i;
					System.out.println("1. Edit Nama");
					System.out.println("2. Edit NIM");
					System.out.println("Pilihan: ");
					no = scan.nextInt();
					
					if(no == 1)
					{
						System.out.println("Masukkan Nama Baru: ");
						nama = hallo.nextLine();
						nim = mhs.getNim();
					}
					else if(no == 2)
					{
						System.out.println("Masukkan NIM Baru: ");
						nim = hallo.nextLine();
						nama = mhs.getNama();
					}
					break;
				}
			}
			daftarMahasiswa.remove(index);
			daftarMahasiswa.add(index, new Mahasiswa(nama, nim));
		}
		else if (no == 4) {
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
			} 
			daftarMahasiswa.remove(index);
		}
		else if (no == 5) {
			System.exit(1);
			}
		} 
		while (true);
	}
}
