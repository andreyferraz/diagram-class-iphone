package main.java.com.iphoneprojeto;

import main.java.com.iphoneprojeto.interfaces.IpodOperator;

public class IPod implements IpodOperator {

    private Iphone iphone;

    public IPod(Iphone iphone) {
        this.iphone = iphone;
    }

    public void useSincronizarConteudoItunes() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        SincronizarConteudoItunes sincronizarConteudoItunes = new SincronizarConteudoItunes();
        sincronizarConteudoItunes.sincronizar();
    }

    public void usePesquisarMusicas() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        PesquisarMusicas pesquisarMusicas = new PesquisarMusicas();
        pesquisarMusicas.pesquisar();
    }
    
    public void useReproduzirMusicas() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        ReproduzirMusicas reproduzirMusicas = new ReproduzirMusicas();
        reproduzirMusicas.reproduzir();
    }
    
    public void useAvaliarMusicas() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        AvaliarMusicas avaliarMusicas = new AvaliarMusicas();
        avaliarMusicas.avaliar();
    }
    
    public void useVisualizarCapaDosAlbuns() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        VisualizarCapaDosAlbuns visualizarCapaDosAlbuns = new VisualizarCapaDosAlbuns();
        visualizarCapaDosAlbuns.visualizar();
    }
    
    public void useReproduzirVideos() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        ReproduzirVideos reproduzirVideos = new ReproduzirVideos();
        reproduzirVideos.reproduzir();
    }

    public class SincronizarConteudoItunes {
        public void sincronizar() {
            System.out.println("Sincronizando conteudo iTunes.");
        }
    }
    
    public class PesquisarMusicas {
        public void pesquisar() {
            System.out.println("Pesquisando musicas.");
        }
    }
    
    public class ReproduzirMusicas {
        public void reproduzir() {
            System.out.println("Reproduzindo musicas.");
        }
    }
    
    public class AvaliarMusicas {
        public void avaliar() {
            System.out.println("Avaliando musicas.");
        }
    }
    
    public class VisualizarCapaDosAlbuns {
        public void visualizar() {
            System.out.println("Visualizando capas dos albuns.");
        }
    }
    
    public class ReproduzirVideos {
        public void reproduzir() {
            System.out.println("Reproduzindo videos.");
        }
    }

}
