package Library;

public class ScientificBook extends Book{
    public ScientificBook(String name, String author, int pages, String area){
        super(name, author, pages);
        this.area = area;
    }

    private String area;
}
