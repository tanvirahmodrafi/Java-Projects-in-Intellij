public class Book {
    protected String title;
    protected String author;
    protected String uniqueId;
    protected String category;
    protected boolean isAvailable = false;
    protected boolean isHardCopy = true;

    Book(String title, String author, String uniqueId, String category, boolean isAvailable, boolean isHardCopy) {
        this.title = title;
        this.author = author;
        this.uniqueId = uniqueId;
        this.category = category;
        this.isAvailable = isAvailable;
        this.isHardCopy = isHardCopy;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getUniqueId() {
        return uniqueId;
    }
    public String getCategory() {
        return category;
    }
    public boolean getIsHardCopy(){return isHardCopy;}
    public boolean isAvailable() {return isAvailable;}





    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setAvailable(boolean available) {this.isAvailable = available;}
    public void setHardCopy(boolean hardCopy) {this.isHardCopy = hardCopy;}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + uniqueId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", isAvailable=" + isAvailable +
                ", isHardCopy=" + isHardCopy +
                '}';
    }
}
