package tugas3;

public class ikan extends hewan{
    private String biak;
    private String sisik;
    private String sirip;
    private String kumis;
    private String lendir;
    private String renang;
    
    void suara(){
        System.out.println("kada besuara");
    }

    public String getbiak() {
        return biak;
    }

    public void setbiak(String biak) {
        this.biak = biak;
    }

    public String getsisik() {
        return sisik;
    }

    public void setsisik(String sisik) {
        this.sisik = sisik;
    }

    public String getsirip() {
        return sirip;
    }

    public void setsirip(String sirip) {
        this.sirip = sirip;
    }

    public String getkumis() {
        return kumis;
    }

    public void setkumis(String kumis) {
        this.kumis = kumis;
    }

    public String getlendir() {
        return lendir;
    }

    public void setlendir(String lendir) {
        this.lendir = lendir;
    }

    public String getrenang() {
        return renang;
    }

    public void setrenang(String renang) {
        this.renang = renang;
    }
    
    
}
