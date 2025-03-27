package dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
    }

    public double calcularSalarioFinal() {
        switch (categoria) {
            case "A":
                return salarioBase * 1.2;
            case "B":
                return salarioBase * 1.1;
            case "C":
            default:
                return salarioBase;
        }
    }
}