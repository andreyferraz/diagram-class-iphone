package main.java.com.iphoneprojeto;

public abstract class Internet {
    private EmailHtml emailHtml;
    private NavegadorSafari navegadorSafari;
    private GoogleMaps googleMaps;
    private Widgets widgets;

    public Internet() {
        emailHtml = new EmailHtml();
        navegadorSafari = new NavegadorSafari();
        googleMaps = new GoogleMaps();
        widgets = new Widgets();
    }

    public void useEmailHtml() {
        emailHtml.use();
    }
    public void useNavegadorSafari() {
        navegadorSafari.use();
    }
    public void useGoogleMaps() {
        googleMaps.use();
    }
    public void useWidgets() {
        widgets.use();
    }

    public class EmailHtml {
        public void use() {
            System.out.println("Utilizando o serviço de email HTML");
        }
    }
    public class NavegadorSafari {
        public void use() {
            System.out.println("Utilizando o serviço de navegador Safari");
        }
    }
    public class GoogleMaps {
        public void use() {
            System.out.println("Utilizando o serviço de Google Maps");
        }
    }
    public class Widgets {
        public void use() {
            System.out.println("Utilizando o serviço de Widgets");
        }
    }

}
