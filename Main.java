import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<String> namaKelas = new ArrayList<>();
    namaKelas.add("44-01");
    namaKelas.add("44-02");

    for(String kelas: namaKelas){
      System.out.println(kelas);
    }

    ArrayList<Integer> daftarNip = new ArrayList<>();
    daftarNip.add(1234);
    daftarNip.add(4321);

    for(int nip: daftarNip){
      System.out.println(nip);
    }

    HashMap<Integer, String> daftarDosen = new HashMap<Integer, String>();
    daftarDosen.put(12345, "Patrick");
    daftarDosen.put(54321, "Dewi");

    System.out.println(daftarDosen.get(12345));
    System.out.println(daftarDosen.get(54321));
    
    Dosen patrick = new Dosen();
    patrick.setNama("Patrick");
    patrick.setNip(12345);
    patrick.mengajar("Android");
    patrick.mengajar();
    patrick.unitKerja = "FIT";
    patrick.berkerja();

    Dosen dewi = new Dosen();
    dewi.setNama("Dewi");
    dewi.setNip(54321);
    dewi.mengajar("PBO");
    patrick.mengajar();
    dewi.unitKerja = "FEB";
    dewi.berkerja();

    Programmer pramuko = new Programmer();
    pramuko.bekerja();
  }
}