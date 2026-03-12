public class TestaPlacar {
    public static void main(String[] args) {
        Placar jogo = new Placar("Lakers", "Bulls");

        System.out.println(jogo.toString());

        jogo.registrarPonto("casa", 3);
        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("casa", 1);

        System.out.println(jogo.toString());

        jogo.proximoQuarto();
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("visitante", 3);

        jogo.registrarPonto("arbitro", 2);

        System.out.println(jogo.toString());

        jogo.proximoQuarto();
        jogo.proximoQuarto();

        System.out.println(jogo.toString());

        jogo.proximoQuarto();
    }
}