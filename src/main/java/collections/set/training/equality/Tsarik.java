package collections.set.training.equality;

/**
 * Created by User on 03.11.2018.
 */
public class Tsarik {
    private int qanak;
    private String anun;

    public Tsarik(int qanak, String anun) {
        this.qanak = qanak;
        this.anun = anun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tsarik tsarik = (Tsarik) o;

        if (qanak != tsarik.qanak) return false;
        return anun != null ? anun.equals(tsarik.anun) : tsarik.anun == null;
    }

    @Override
    public int hashCode() {
        int result = qanak;
        result = 31 * result + (anun != null ? anun.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "equality.Tsar{" +
                "qanak=" + qanak +
                ", anun='" + anun + '\'' +
                '}';
    }
}
