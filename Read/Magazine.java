package inteface.Read;

public class Magazine extends News implements Readable {
    public Magazine(String name, int pages) {
        super(name, pages);
    }

    @Override
    public void readable() {
        System.out.println("new cosmetics");
    }
}
