package main.java.com.iphoneprojeto;

import main.java.com.iphoneprojeto.interfaces.InternetOperator;

public class Internet implements InternetOperator {

    private Iphone iphone;

    public Internet(Iphone iphone) {
        this.iphone = iphone;
    }

    public void useEmailHtml() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        EmailHtml emailHtml = new EmailHtml();
        emailHtml.use();
        
    }
    public void useNavegadorSafari() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        NavegadorSafari navegadorSafari = new NavegadorSafari();
        navegadorSafari.use();
    }
    public void useGoogleMaps() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.use();
    }
    public void useWidgets() {
        iphone.useSistemaOsx();
        iphone.useTouchScreen();
        iphone.connectWifi();
        Widgets widgets = new Widgets();
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
