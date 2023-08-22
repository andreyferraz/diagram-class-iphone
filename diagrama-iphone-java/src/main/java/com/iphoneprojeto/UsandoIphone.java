package main.java.com.iphoneprojeto;

public class UsandoIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        //Ligando o iPhone e suas funcionalidades
        meuIphone.useSistemaOsx();
        meuIphone.useTouchScreen();
        meuIphone.useSensorAproximacao();
        meuIphone.connectWifi();
        meuIphone.enableBluetooth();
        meuIphone.useRotacaoTela();

        System.out.println();
        //quero sincronizar as minhas músicas
        iPod iPod = new iPod();
        iPod.useSincronizarConteudoItunes();

        System.out.println();

    }
}
