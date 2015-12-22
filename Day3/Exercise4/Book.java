
package Exercise4;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int qtyInStock = 0;
    public Book(String name, ArrayList<Author> authors, double price, int qtyInStock){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        authors.add(author);
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Author> getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    public String toDisplay(){
        StringBuffer output = new StringBuffer(String.format("%s by ",name));
        Iterator<Author> authorIterator = authors.iterator();
        while(authorIterator.hasNext()){
            output.append(authorIterator.next().toDisplay());
        }
        output.append(String.format("Price : %f and number of books available : %d",price,qtyInStock));
        return output.toString();
    }
    public void printAuthors(){
        for(Author author : authors){
            String.format("%s %c at %s\n",author.getName(), author.getGender(), author.getEmail());
        }
    }
    public void addAuthors(Author author){
        authors.add(author);
    }
    public static void main(String[] args){
        Author author = new Author("R.K. Narayan", "rknarayan@gmail.com", 'M');
        ArrayList<Author> manyAuthor = new ArrayList<Author>();
        manyAuthor.add(author);
        manyAuthor.add(author);
        manyAuthor.add(author);
        Book book = new Book("XYZ", manyAuthor, 500, 3);
        book.addAuthors(author);
        System.out.println(book.toDisplay());
    }
}