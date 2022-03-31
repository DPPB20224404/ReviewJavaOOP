public class Programmer extends Pekerja implements Buruh{
  @Override
  public void bekerja(){
    System.out.println("Bekerja di depan komputer");
  }

  @Override
  public void berangkatKerja(){
    System.out.println("WFH dan tidak berangkat kerja");
  }
  
}