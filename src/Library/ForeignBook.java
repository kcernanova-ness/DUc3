package Library;

public class ForeignBook extends Book{
    public ForeignBook(String name, String author, int pages){
        super(name, author, pages);
        this.language = "English";
    }

    public ForeignBook(String name, String author, int pages, String language){
        super(name, author, pages);
        this.language = language;
    }

    private String language;
}
