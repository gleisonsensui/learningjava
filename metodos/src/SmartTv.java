public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    boolean getLigada() {
        return this.ligada;
    }

    int getCanal() {
        return this.canal;
    }

    int getVolume() {
        return this.volume;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void diminuirVolume() {
        this.volume -= 1;
    }

    public void mudarCanal(int numCanal) {
        this.canal = numCanal;
    }

    public void aumentarCanal() {
            this.canal += 1;
    }

    public void diminuirCanal() {
            this.canal -= 1;
    }

}
