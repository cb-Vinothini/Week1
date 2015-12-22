
package Exercise4;

class Book{
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int qtyInStock = 0;
    public Book(String name, Author[] authors, double price, int qtyInStock){
        this.name = name;
        authors.addAll(authors);
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
        Iterator<Author> authorIterator = aithors.iterator();
        while(authorIterator.hasNext()){
            output.append(author.toDisplay());
        }
        output.append(String.format("Price : %f and number of books available : %d",price,qtyInStock));
        return output.toString();
    }
    public void printAuthors(){
        for(author in authors){
            String.format("%s %c at %s",author.getName(), author.getGender(), author.getEmail());
        }
    }
    
}