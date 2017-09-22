/**
 * Created by jc225828 on 22/09/17.
 */
public abstract class Book
{
    String title = new String();
    double price;
    public Book(String y)
    {
        title = y;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
