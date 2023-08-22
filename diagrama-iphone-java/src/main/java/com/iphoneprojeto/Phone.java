package main.java.com.iphoneprojeto;

public class Phone {
    private FazerChamada fazerChamada;
    private ReceberChamada receberChamada;
    private SincronizarContatos sincronizarContatos;
    private ContatosFavoritos contatosFavoritos;
    private AdicionarContato adicionarContato;
    private RemoverContato removerContato;
    private EditarContato editarContato;
    private HistoricoDeLigacoes historicoDeLigacoes;
    private GaleriaDeFotos galeriaDeFotos;
    private AplicarZoomNaImagem aplicarZoomNaImagem;
    private SetarImagemComoPapelDeParede setarImagemComoPapelDeParede;
    private Calendario calendario;
    private SMS sms;
    private CorreioDeVoz correioDeVoz;

    public Phone(){
        fazerChamada = new FazerChamada();
        receberChamada = new ReceberChamada();
        sincronizarContatos = new SincronizarContatos();
        contatosFavoritos = new ContatosFavoritos();
        adicionarContato = new AdicionarContato();
        removerContato = new RemoverContato();
        editarContato = new EditarContato();
        historicoDeLigacoes = new HistoricoDeLigacoes();
        galeriaDeFotos = new GaleriaDeFotos();
        aplicarZoomNaImagem = new AplicarZoomNaImagem();
        setarImagemComoPapelDeParede = new SetarImagemComoPapelDeParede();
        calendario = new Calendario();
        sms = new SMS();
        correioDeVoz = new CorreioDeVoz();
    }

    public void fazerChamada(){
        fazerChamada.fazerChamada();
    }
    public void receberChamada(){
        receberChamada.receberChamada();
    }
    public void sincronizarContatos(){
        sincronizarContatos.sincronizarContatos();
    }
    public void contatosFavoritos(){
        contatosFavoritos.contatosFavoritos();
    }
    public void adicionarContato(){
        adicionarContato.adicionarContato();
    }
    public void removerContato(){
        removerContato.removerContato();
    }
    public void editarContato(){
        editarContato.editarContato();
    }
    public void historicoDeLigacoes(){
        historicoDeLigacoes.historicoDeLigacoes();
    }
    public void galeriaDeFotos(){
        galeriaDeFotos.galeriaDeFotos();
    }
    public void aplicarZoomNaImagem(){
        aplicarZoomNaImagem.aplicarZoomNaImagem();
    }
    public void setarImagemComoPapelDeParede(){
        setarImagemComoPapelDeParede.setarImagemComoPapelDeParede();
    }
    public void calendario(){
        calendario.calendario();
    }
    public void sms(){
        sms.sms();
    }
    public void correioDeVoz(){
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
