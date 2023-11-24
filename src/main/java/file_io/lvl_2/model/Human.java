package file_io.lvl_2.model;

import java.io.Serializable;
import java.util.List;

public class Human implements Serializable {
  private String azganun;
  private String anun;
  private String hayranun;
  private String azgutyun;
  private int hasak;
  private int qash;
  private List<MyDate> date;
  private String heraxosihamar;
  private List<MyAddress> address;

  public Human(String azganun, String anun, String hayranun, String azgutyun, int hasak, int qash, List<MyDate> date,
               String heraxosihamar, List<MyAddress> address) {
    this.azganun = azganun;
    this.anun = anun;
    this.hayranun = hayranun;
    this.azgutyun = azgutyun;
    this.hasak = hasak;
    this.qash = qash;
    this.date = date;
    this.heraxosihamar = heraxosihamar;
    this.address = address;
  }


  public String getAzganun() {
    return azganun;
  }

  public String getAnun() {
    return anun;
  }

  public String getHayranun() {
    return hayranun;
  }

  public String getAzgutyun() {
    return azgutyun;
  }

  public int getHasak() {
    return hasak;
  }

  public int getQash() {
    return qash;
  }

  public List<MyDate> getDate() {
    return date;
  }

  public String getHeraxosihamar() {
    return heraxosihamar;
  }

  public List<MyAddress> getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "model.Human{" +
            "azganun='" + azganun + '\'' +
            ", anun='" + anun + '\'' +
            ", hayranun='" + hayranun + '\'' +
            ", azgutyun='" + azgutyun + '\'' +
            ", hasak=" + hasak +
            ", qash=" + qash +
            ", date=" + date +
            ", heraxosihamar='" + heraxosihamar + '\'' +
            ", address=" + address +
            '}';
  }
}
