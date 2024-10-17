package PaqueteDeTrabajo;

public class Notas {
    private int n1, n2, n3, nf;
    private double prom;

    public Notas(int n1, int n2, int n3, int nf) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.nf = nf;
        this.prom = (n1+n2+n3+nf)/4;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getNf() {
        return nf;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = (int)prom;
    }
    
    
}