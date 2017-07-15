/**
 * Created by steeve on 7/14/17.
 */
public class Book {


    private String title;
    private int num_pages;
    private double price;
    private int quantity;

    public Book(String title, int num_pages, double price, int quantity){

        this.title = title;
        this.num_pages = num_pages;
        this.price = price;
        this.quantity = quantity;

    }

    public double sell(int num){
        return (num > 0 && num <= this.getQuantity())? (num * this.getPrice()) : 0;
    }

    public String toString(){
        return
                "Book Title: " + this.getTitle() +
                "\nNumber of pages: " + this.getNum_pages() +
                "\nPrice: $" + this.price +
                "\nQuantity: " + this.getQuantity();
    }

    public Book cliffNotes(){
        if(this.num_pages > 300){
            Book cn = new Book(("cliff " + this.getTitle()), (this.getNum_pages() / 6),
                    (this.getPrice() * 0.5), this.getQuantity());

            return cn;
        }
        else
            return null;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum_pages() {
        return num_pages;
    }

    public void setNum_pages(int num_pages) {
        this.num_pages = num_pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
