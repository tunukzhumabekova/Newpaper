package inteface.Read;

public abstract class News {
    private String name;
    private int pages;

    public News(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
