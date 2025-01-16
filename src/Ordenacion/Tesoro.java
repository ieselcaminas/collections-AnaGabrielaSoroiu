package Ordenacion;

public class Tesoro implements Comparable<Tesoro>{
    private int orden;
    private String objeto;
    private int valor;
    private double peso;


    public Tesoro(String objeto, int valor, double peso, int orden) {
        this.objeto = objeto;
        this.valor = valor;
        this.peso = peso;
        this.orden = orden;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return this.objeto + " ";
    }

    @Override
    public int compareTo(Tesoro other) {
        if (this.valor == other.valor && this.peso == other.peso) {
            return this.orden - other.orden;
        } else if (this.valor == other.valor) {
            return Double.compare(other.peso, this.peso);
        }
        else {
            return other.valor - this.valor;
        }
    }
}
