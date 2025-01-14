package Ordenacion;

public class Tesoro implements Comparable<Tesoro>{
    private String objeto;
    private int valor;
    private double peso;

    public Tesoro(String objeto, int valor, double peso) {
        this.objeto = objeto;
        this.valor = valor;
        this.peso = peso;
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

    @Override
    public String toString() {
        return this.objeto + " ";
    }

    @Override
    public int compareTo(Tesoro other) {
        if (this.valor == other.valor) {
            return Double.compare(this.peso, other.getPeso());
        } else {
            return other.valor - this.valor;
        }
    }
}
