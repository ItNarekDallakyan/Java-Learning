package file_io.lvl_2.model;

import java.io.Serializable;

public class MyDate implements Serializable {
    private String tari;
    private String amis;
    private String or;


    public MyDate(String tari, String amis, String or) {
        this.tari = tari;
        this.amis = amis;
        this.or = or;
    }

    public void setTari(String tari) {
        this.tari = tari;
    }

    public String getTari() {
        return tari;
    }

    public MyDate() {

    }
}

