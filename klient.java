public class Klient {
    private String imie;
    private int wiek;
    
    public Klient(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    
    public void przedstawSie() {
        System.out.println("Cześć, jestem " + imie + " i mam " + wiek + " lat.");
    }
}
