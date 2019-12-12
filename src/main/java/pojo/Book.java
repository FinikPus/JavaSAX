package pojo;

public class Book {
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBinding() {
        return binding;
    }

    public String getPages() {
        return pages;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;

        if (binding != null ? !binding.equals(book.binding) : book.binding != null) return false;
        if (pages != null ? !pages.equals(book.pages) : book.pages != null) return false;

        return price != null ? price.equals(book.price) : book.price == null;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + binding.hashCode();
        result = 31 * result + pages.hashCode();
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String title;
    private String author;
    private String binding;
    private String pages;
    private String price;


}
