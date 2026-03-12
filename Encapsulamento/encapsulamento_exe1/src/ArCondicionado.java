public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){}
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }

    public void setMarca(String m){
        if(m.length() >= 3){
            this.marca = m;
        }
        else System.out.println("A marca deve ter pelo menos 3 caracteres.");
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String m){
        this.modelo = m;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setTemperatura(int t){
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        }
        else System.out.println("Temperatura fora da faixa.");
    }
    public int getTemperatura() {
        return temperatura;
    }

    public void setLigado(boolean l){
        this.ligado = l;
    }
    public boolean getLigado(){
        return this.ligado;
    }

    public void ativarModoTurbo(){
        if(verificarCompressor()){
            this.setTemperatura(16);
        }
        else System.out.println("Problema com o compressor detectado.");
    }

    private boolean verificarCompressor(){
        int random = (int) (Math.random() * 10);
        if(random > 2){
            return true;
        }
        else return false;
    }

    public String toString(){
        return "Marca: " + this.getMarca() + " | Modelo: " + this.getModelo() +
                " | Temperatura: " + this.getTemperatura() + " °C" + " | Status: " + (this.getLigado()? "Ligado" : "Desligado");
    }
}