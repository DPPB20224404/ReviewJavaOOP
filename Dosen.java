public class Dosen extends Pegawai{
  private String nama;
  private int nip;

  public void setNama(String nama){
    this.nama = nama;
  }

  public String getNama(){
    return this.nama;  
  }

  public void setNip(int nip){
    this.nip = nip;
  }

  public int getNip(){
    return this.nip;
  }
  
  public Dosen(){
  }

  public void mengajar(String kelas){
    System.out.println(this.nama + " sedang mengajar " + kelas);
  }

  public void mengajar(){
    System.out.println("Sedang mengajar kelas kosong");
  }

  @Override
  public void berkerja(){
    System.out.println(this.nama + " bekerja dengan NIP " + this.nip);
  }
}