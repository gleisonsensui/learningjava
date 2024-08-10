public class UsuarioSmart {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Status inicial: Tv Ligada? " + smartTv.ligada);
        System.out.println("Status inicial: Canal inicial: " + smartTv.canal);
        System.out.println("Status inicial: Volume inicial: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status: Tv Ligada? " + smartTv.ligada);
        
        
        smartTv.aumentarVolume();
        System.out.println("Novo status: Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo status: Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status: Volume atual: " + smartTv.volume);
        
        
        smartTv.aumentarCanal();
        System.out.println("Novo status: Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo status: Canal atual: " + smartTv.canal);        
        smartTv.diminuirCanal();
        System.out.println("Novo status: Canal atual: " + smartTv.canal);








    }

    
}
