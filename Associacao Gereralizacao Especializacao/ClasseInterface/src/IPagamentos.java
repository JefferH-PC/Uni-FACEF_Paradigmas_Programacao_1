public interface IPagamentos{
    //contrato: quem implementar essa interface, deve implementar esses métodos
     void autorizar(float valor);
     void exibirComprovante();

}