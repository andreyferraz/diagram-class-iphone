package main.java.com.iphoneprojeto;

public class UsandoIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // quero sincronizar as minhas músicas
        IPod ipod = new IPod(meuIphone);
        ipod.useSincronizarConteudoItunes();
        System.out.println();

        // acessando o navegador safari
        Internet internet = new Internet(meuIphone);
        internet.useNavegadorSafari();
        System.out.println();

        //fazendo uma ligação
        Phone phone = new Phone(meuIphone);
        phone.fazerChamada();
    }
}
