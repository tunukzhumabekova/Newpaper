package inteface.Read;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gadjet gadjet = new Gadjet("iphone14", 5);
        gadjet.readable();
        Newspaper newspaper = new Newspaper("super Info", 9);
        newspaper.readable();
        Magazine magazine = new Magazine("Kosmetics", 10);
        magazine.readable();
        News[]news1={gadjet,newspaper,magazine};
        System.out.println(Arrays.toString(news1));
    }

}
