public class SmartTv{
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv(){
        this.marca = "";
        this.modelo = "";
        this.conectadaInternet = false;
    }
    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadaInternet = false;
    }

    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido.");
    }
    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        char aux = marca.charAt(0);
        boolean resp = Character.isUpperCase(aux);
        if(resp){
            this.marca = marca;
        }
        else System.out.println("Marca inválida.");
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        if(modelo.length() <= 30){
            this.modelo = modelo;
        }
        else System.out.println("Modelo inválido.");
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setConexao(boolean conectar){
        this.conectadaInternet = conectaInternet();
    }
    public boolean getConexao(){
        return  this.conectadaInternet;
    }

    public void abrirYoutube(){
        if(this.conectaInternet()){
            System.out.println("Abrindo Youtube...");
        }
        else System.out.println("Sem internet para abrir Youtube...");
    }
    private boolean conectaInternet(){
        System.out.println("Buscando sinal de wi-fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando o IP do roteador...");
        int random = (int) (Math.random() * 10);
        if(random < 5){
            this.conectadaInternet = true;
            return true;
        }
        else {
            this.conectadaInternet = false;
            return false;
        }
    }

    public void aumentarVolume(int volume){
        if(volume > 0){
            this.setVolume(this.getVolume() + volume);
            System.out.println("Volume aumentado em " + volume);
            System.out.println("Volume atual: " + this.getVolume());
        }
    }
    public void diminuirVolume(int volume){
        if(volume > 0){
            this.setVolume(this.volume - volume);
        }
    }
    public String toString(){
        return "Marca: " + this.marca + " | Modelo: " + this.modelo +
                " | Volume: " + this.volume + " | Conectado na Internet - " + (this.conectadaInternet? "Sim" : "Não");
    }


}