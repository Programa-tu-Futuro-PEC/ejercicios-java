package email;

public class Main {

    public static void main(String[] args) {
        Email e1 = new Email("juanita",
                "juanita@hotmail.com",
                "1234");
        Email e2 = new Email("paulita",
                "paulita@gmail.com",
                "DHT#rsdve43fsd3R");

        e1.enviar("wena", e2);
        e2.leer();
        e2.enviar("wena wena", e1);
        e1.leer();
    }

}
