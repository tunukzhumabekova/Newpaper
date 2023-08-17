package inteface.Read;

import java.util.NavigableMap;

public class Newspaper extends News implements Readable {
    public Newspaper(String name, int pages) {
        super(name, pages);
    }

    @Override
    public void readable() {
        System.out.println("new news");
    }
}
