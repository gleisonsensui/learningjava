public class ResultadoEscolar {
    public static void main(String[] args) {
        double media = 6;

        /*
        if (media > 7) {
            System.out.println("Parabens, voce foi aprovado.");
        } else if (media < 5) {
            System.out.println("Voce está de reprovado");
        } else {
            System.out.println("Voce está de recuperação");
        }
        */

        String resultado = media < 7 ? "Voce está de reprovado" : "Voce está de Aprovado";
        System.out.println(resultado);

    }
}
