package lutador;

public class Combate {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Bro", "Brasil", 20, 1.6f, 79.3f, 11, 2, 3);
        l[1] = new Lutador("Luidgi", "Italia", 27, 1.8f, 97.5f, 3, 0, 2);
        l[2] = new Lutador("Mario", "Franca", 20, 1.54f, 56.3f, 4, 1, 0);
        l[3] = new Lutador("Maria", "USA", 30, 1.9f, 100f, 8, 0, 1);
        l[4] = new Lutador("Vivian", "Iceland", 18, 1.5f, 60.3f, 9, 5, 3);
        l[5] = new Lutador("Klinton", "Ireland", 30, 1.7f, 90.3f, 5, 2, 5);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[4]);
        UEC01.lutar();
    }
}
