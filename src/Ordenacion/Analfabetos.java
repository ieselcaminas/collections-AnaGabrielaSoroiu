package Ordenacion;

public class Analfabetos implements Comparable<Analfabetos>{
    private String pais;
    private int analfabeto;

    public Analfabetos(String pais, int analfabeto) {
        this.pais = pais;
        this.analfabeto = analfabeto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnalfabeto() {
        return analfabeto;
    }

    public void setAnalfabeto(int analfabeto) {
        this.analfabeto = analfabeto;
    }

    @Override
    public String toString() {
        return this.pais + " - " + this.analfabeto;
    }

    @Override
    public int compareTo(Analfabetos other) {
        return other.getAnalfabeto() - this.getAnalfabeto();
    }


}
