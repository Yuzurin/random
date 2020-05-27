public class Rumah {

  private String alamat;
  private static final boolean tempatTidur = true;
  private String name;

  public Rumah() {}

  public Rumah(String alamat, String name) {
    this.alamat = alamat;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
