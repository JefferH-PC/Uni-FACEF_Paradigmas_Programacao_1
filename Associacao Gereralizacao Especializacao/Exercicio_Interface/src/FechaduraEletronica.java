public class FechaduraEletronica implements  IAutenticavel, IDispositivoLigavel{

    private String senhaCorreta;
    private boolean validAcesso;

    public FechaduraEletronica() {
    }

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.validAcesso = false;
    }

    @Override
    public void validarAcesso(String senha) {
        if(senha.equals(this.senhaCorreta)){
            this.validAcesso = true;
            System.out.println("Acesso liberado.");
        }
        else{
            System.out.println("Acesso negado, senha incorreta.");
        }
    }

    @Override
    public void ligar() {
        if(this.validAcesso){
            System.out.println("Fechadura eletrônica destrancada.");
        }
        else{
            System.out.println("Erro ao destrancar a fechadura eletrônica. Favor validar acesso e tentar novemente.");
        }
    }

    @Override
    public void desligar() {
        System.out.println("Fechadura eletrônica trancada.");
    }

    public String getSenhaCorreta() {
        return senhaCorreta;
    }

    public void setSenhaCorreta(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    public boolean isValidAcesso() {
        return validAcesso;
    }

    public void setValidAcesso(boolean validAcesso) {
        this.validAcesso = validAcesso;
    }

}
