package main.java.com.iphoneprojeto;

public class Iphone {
    private SistemaOsx sistemaOsx;
    private TouchScreen touchScreen;
    private SensorAproximacao sensorAproximacao;
    private Wifi wifi;
    private Bluetooth bluetooth;
    private RotacaoTela rotacaoTela;

    public Iphone() {
        sistemaOsx = new SistemaOsx();
        touchScreen = new TouchScreen();
        sensorAproximacao = new SensorAproximacao();
        wifi = new Wifi();
        bluetooth = new Bluetooth();
        rotacaoTela = new RotacaoTela();
    }

    public void useSistemaOsx() {
        sistemaOsx.use();
    }

    public void useTouchScreen() {
        touchScreen.touch();
    }

    public void useSensorAproximacao() {
        sensorAproximacao.use();
    }

    public void connectWifi() {
        wifi.connect();
    }

    public void enableBluetooth() {
        bluetooth.enable();
    }

    public void useRotacaoTela() {
        rotacaoTela.use();
    }

    public class SistemaOsx {
        public void use() {
            System.out.println("Sistema de OSX detectado. Serviço de sistema de OSX realizado.");
        }
    }

    public class TouchScreen {
        public void touch() {
            System.out.println("Toque na tela detectado. Serviço de touchscreen realizado.");
        }
    }

    public class SensorAproximacao {
        public void use() {
            System.out.println("Sensor de aproximacao detectado. Serviço de sensor de aproximacao realizado.");
        }
    }

    public class Wifi {
        public void connect() {
            System.out.println("Wifi detectado. Serviço de conexao Wifi realizado.");
        }
    }

    public class Bluetooth {
        public void enable() {
            System.out.println("Bluetooth detectado. Serviço de Bluetooth realizado.");
        }
    }
    
    public class RotacaoTela {
        public void use() {
            System.out.println("Rotacao da tela detectada. Serviço de rotacao da tela realizado.");
        }
    }

}

