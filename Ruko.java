public class Ruko extends Rumah {

  private String barangJualan;

  public Ruko() {
    super();
  }

  public Ruko(String name, String alamat, String barangJualan) {
    super(alamat, name);
    this.barangJualan = barangJualan;
  }

  public String getBarangJualan() {
    return barangJualan;
  }

  public void setBarangJualan(String barangJualan) {
    this.barangJualan = barangJualan;
  }
}
