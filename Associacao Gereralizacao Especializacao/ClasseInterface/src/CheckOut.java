public class CheckOut {
    public static void main(String[] args){
        IPagamentos seletor; // objeto do tipo interface

        seletor = new CartaoCredito("1111222233334444");
        seletor.autorizar(600.0f);
        seletor.exibirComprovante();

        seletor = new Pix("teste@pix.com");
        seletor.autorizar(600.0f);
        seletor.exibirComprovante();
    }
}
