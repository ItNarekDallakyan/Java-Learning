package file_io.lvl_2.model;

import java.io.Serializable;

public class MyAddress implements Serializable {
    private String post;
    private String taracq;
    private String poxoc;
    private String qaxaq;
    private String tun;
    private String hamar;

    public MyAddress(String post, String taracq, String poxoc, String qaxaq, String tun, String hamar) {
        this.post = post;
        this.taracq = taracq;
        this.poxoc = poxoc;
        this.qaxaq = qaxaq;
        this.tun = tun;
        this.hamar = hamar;
    }

    public MyAddress() {

    }

    @Override
    public String toString() {
        return "model.MyAddress{" +
                "post='" + post + '\'' +
                ", taracq='" + taracq + '\'' +
                ", poxoc='" + poxoc + '\'' +
                ", qaxaq='" + qaxaq + '\'' +
                ", tun='" + tun + '\'' +
                ", hamar='" + hamar + '\'' +
                '}';
    }
}
