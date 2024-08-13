public class EscopoClass {
    // Escopo de classe
    private double salario = 0;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double valor) {
        // Escopo funcional/metodo
        this.salario += valor;
    }

    public String showSalario() {
        return "O seu salario atual é: R$ "+ this.salario;
    }


}
