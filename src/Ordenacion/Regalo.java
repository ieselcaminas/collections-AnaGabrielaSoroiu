package Ordenacion;

public class Regalo implements Comparable<Regalo>{
    private int lista;
    private double peso;

    public Regalo(int lista, double peso) {
        this.lista = lista;
        this.peso = peso;
    }

    public int getLista() {
        return lista;
    }

    public void setLista(int lista) {
        this.lista = lista;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   @Override
   public String toString() {
        return this.lista + " " + this.peso;
   }

    @Override
    public int compareTo(Regalo other) {
        if (this.lista == other.lista) {
            return Double.compare(this.peso, other.peso);
        } else {
           return other.lista - this.lista;
        }
    }

}
