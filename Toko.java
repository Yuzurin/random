public class Toko {

  private String barangJualan;
  private String alamat;
  private static final boolean tempatTidur = false;
  private String name;

  public Toko() {}

  public Toko(String alamat, String barangJualan, String name) {
    this.alamat = alamat;
    this.barangJualan = barangJualan;
    this.name = name;
  }

  public boolean hasTempatTidur() {
    return tempatTidur;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getBarangJualan() {
    return barangJualan;
  }

  public void setBarangJualan(String barangJualan) {
    this.barangJualan = barangJualan;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
