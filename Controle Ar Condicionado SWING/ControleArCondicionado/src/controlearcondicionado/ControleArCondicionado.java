package controlearcondicionado;

/**
 *
 * @author Gabriel Haruki Gomes Satô - RA: 120150
 */
public class ControleArCondicionado {
    
    private int temperatura;
    private boolean ligado;
    private boolean oscilar;
    
    public ControleArCondicionado() { //Construtor
        this.temperatura = 0;
        this.ligado = false;
        this.oscilar = false;
    }
    
    public ControleArCondicionado(int temp, boolean ligado, boolean oscilar) { //Construtor sobrecarregado
        this.temperatura = temp;
        this.ligado = ligado;
        this.oscilar = oscilar;
    }
    
    public int getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(int temp) {
        this.temperatura = temp;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean getOscilar() {
        return this.oscilar;
    }
    
    public void setOscilar(boolean oscilando) {
        this.oscilar = oscilando;
    }
    
}
