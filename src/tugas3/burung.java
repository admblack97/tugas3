package tugas3;

public class burung extends hewan{
    private String biak;
    private Integer kaki;
    private String terbang;
    private String apung;
    
    void suara (){
        System.out.println("kukuruyuk");
    }

    public String getbiak() {
        return biak;
    }

    public void setbiak(String biak) {
        this.biak = biak;
    }

    public Integer getkaki() {
        return kaki;
    }

    public void setkaki(Integer kaki) {
        this.kaki = kaki;
    }

    public String getterbang() {
        return terbang;
    }

    public void setterbang(String terbang) {
        this.terbang = terbang;
    }

    public String getapung() {
        return apung;
    }

    public void setapung(String apung) {
        this.apung = apung;
    }
    
    
    
}
