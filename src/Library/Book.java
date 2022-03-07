package Library;

public class Book {
    public Book(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    private String name;
    private String author;
    private int pages;

    public String toString(){
        return name;
    }
}
