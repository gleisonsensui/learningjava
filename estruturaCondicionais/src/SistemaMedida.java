public class SistemaMedida {
    public static void main(String[] args) {
        String tamanho = "M";

        switch (tamanho) {
            case "P":
            System.out.println("O tamanho é pequenho");                
                break;

            case "M":
            System.out.println("O tamanho é medio");               
                break;

            case "G":
            System.out.println("O tamanho é grande");
            break;
            
            default:
            System.out.println("Está fora do padrão.");
                break;
        }
    }
}   
