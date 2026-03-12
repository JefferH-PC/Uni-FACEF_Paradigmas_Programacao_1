public class Drone{
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(){}
    public Drone(String codigo, float altura, int bateria, boolean emVoo){
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.setEmVoo(emVoo);
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }

    public void setAltura(float altura){
        if(altura >= 0 && altura <= 120){
            this.altura = altura;
        }
        else System.out.println("O drone não pode voar em uma altura menor que 0 ou maior que 120 metros.");
    }
    public float getAltura(){
        return this.altura;
    }

    public void setBateria(int bateria){
        if(bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        }
        else System.out.println("A bateria deve estar entre 0 e 100.");
    }
    public int getBateria(){
        return this.bateria;
    }

    public void setEmVoo(boolean emVoo){
        this.emVoo = emVoo;
    }
    public boolean getEmVoo(){
        return this.emVoo;
    }

    public void decolar(){
        if(this.getBateria() > 20){
            if(this.testarMotores()){
                this.setEmVoo(true);
                this.setAltura(2);
            }
            else System.out.println("Problema com os motores detectado.");
        }
        else System.out.println("Bateria insuficiente para decolar.");
    }

    private boolean testarMotores(){
        System.out.println("Testando hélices..." + "\nCalibrando GPS...");
        return Math.random() * 10 < 8;
    }

    public void subir(float x){
        this.setAltura(this.getAltura() + x);
    }
    public void descer(float x){
        this.setAltura(this.getAltura() - x);
    }
}
