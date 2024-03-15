package tiil.edu.LVNangCao.models;

public class Country {
    String tenQG;
    int soluongDan;
    String tenFileAnhLaCo;

    public Country(String tenQG, int soluongDan, String tenFileAnhLaCo) {
        this.tenQG = tenQG;
        this.soluongDan = soluongDan;
        this.tenFileAnhLaCo = tenFileAnhLaCo;
    }

    public String getTenQG() {
        return tenQG;
    }

    public void setTenQG(String tenQG) {
        this.tenQG = tenQG;
    }

    public int getSoluongDan() {
        return soluongDan;
    }

    public void setSoluongDan(int soluongDan) {
        this.soluongDan = soluongDan;
    }

    public String getTenFileAnhLaCo() {
        return tenFileAnhLaCo;
    }

    public void setTenFileAnhLaCo(String tenFileAnhLaCo) {
        this.tenFileAnhLaCo = tenFileAnhLaCo;
    }
}
