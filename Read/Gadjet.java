package inteface.Read;

public class Gadjet extends News implements Readable {
    public Gadjet(String name, int pages) {
        super(name, pages);
    }

    @Override
    public void readable() {
        System.out.println("new phones");
    }
}
