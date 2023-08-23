package main.java.com.iphoneprojeto;

import main.java.com.iphoneprojeto.interfaces.PhoneOperator;

public class Phone implements PhoneOperator  {
    private Iphone iphone;

    public Phone(Iphone iphone){
        this.iphone = iphone;
    }

    public void fazerChamada(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.useSensorAproximacao();
        FazerChamada fazerChamada = new FazerChamada();
        fazerChamada.fazerChamada();
    }
    public void receberChamada(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.useSensorAproximacao();
        ReceberChamada receberChamada = new ReceberChamada();
        receberChamada.receberChamada();
    }
    public void sincronizarContatos(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        SincronizarContatos sincronizarContatos = new SincronizarContatos();
        sincronizarContatos.sincronizarContatos();
    }
    public void contatosFavoritos(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        ContatosFavoritos contatosFavoritos = new ContatosFavoritos();
        contatosFavoritos.contatosFavoritos();
    }
    public void adicionarContato(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        AdicionarContato adicionarContato = new AdicionarContato();
        adicionarContato.adicionarContato();
    }
    public void removerContato(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        RemoverContato removerContato = new RemoverContato();
        removerContato.removerContato();
    }
    public void editarContato(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        EditarContato editarContato = new EditarContato();
        editarContato.editarContato();
    }
    public void historicoDeLigacoes(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        HistoricoDeLigacoes historicoDeLigacoes = new HistoricoDeLigacoes();
        historicoDeLigacoes.historicoDeLigacoes();
    }
    public void galeriaDeFotos(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.useRotacaoTela();
        GaleriaDeFotos galeriaDeFotos = new GaleriaDeFotos();
        galeriaDeFotos.galeriaDeFotos();
    }
    public void aplicarZoomNaImagem(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.useRotacaoTela();
        AplicarZoomNaImagem aplicarZoomNaImagem = new AplicarZoomNaImagem();
        aplicarZoomNaImagem.aplicarZoomNaImagem();
    }
    public void setarImagemComoPapelDeParede(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.useRotacaoTela();
        SetarImagemComoPapelDeParede setarImagemComoPapelDeParede = new SetarImagemComoPapelDeParede();
        setarImagemComoPapelDeParede.setarImagemComoPapelDeParede();
    }
    public void calendario(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        Calendario calendario = new Calendario();
        calendario.calendario();
    }
    public void sms(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        SMS sms = new SMS();
        sms.sms();
    }
    public void correioDeVoz(){
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        CorreioDeVoz correioDeVoz = new CorreioDeVoz();
        correioDeVoz.correioDeVoz();
    }

    public class FazerChamada{
        public void fazerChamada(){
            System.out.println("Fazendo chamada.");
        }
    }
    public class ReceberChamada{
        public void receberChamada(){
            System.out.println("Recebendo chamada.");
        }
    }
    public class SincronizarContatos{
        public void sincronizarContatos(){
            System.out.println("Sincronizando contatos.");
        }
    }
    public class ContatosFavoritos{
        public void contatosFavoritos(){
            System.out.println("Contatos favoritos.");
        }
    }
    public class AdicionarContato{
        public void adicionarContato(){
            System.out.println("Adicionando contato.");
        }
    }
    public class RemoverContato{
        public void removerContato(){
            System.out.println("Removendo contato.");
        }
    }
    public class EditarContato{
        public void editarContato(){
            System.out.println("Editando contato.");
        }
    }
    public class HistoricoDeLigacoes{
        public void historicoDeLigacoes(){
            System.out.println("Historico de ligacoes.");
        }
    }
    public class GaleriaDeFotos{
        public void galeriaDeFotos(){
            System.out.println("Galeria de fotos.");
        }
    }
    public class AplicarZoomNaImagem{
        public void aplicarZoomNaImagem(){
            System.out.println("Aplicando zoom na imagem.");
        }
    }
    public class SetarImagemComoPapelDeParede{
        public void setarImagemComoPapelDeParede(){
            System.out.println("Setando imagem como papel de parede.");
        }
    }
    public class Calendario{
        public void calendario(){
            System.out.println("Calendario.");
        }
    }
    public class SMS{
        public void sms(){
            System.out.println("SMS.");
        }
    }
    public class CorreioDeVoz{
        public void correioDeVoz(){
            System.out.println("Correio de voz.");
        }
    }

}
