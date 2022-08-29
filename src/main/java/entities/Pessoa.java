package entities;

public class Pessoa {

    private Double altura;

    private Double peso;

    private Double imc;

    public Pessoa (Double altura, Double peso, Double imc){
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }



    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getImc() {
        return imc;
    }



}
