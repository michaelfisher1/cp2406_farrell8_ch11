/**
 * Created by jc225828 on 22/09/17.
 */
public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 24.99;
    }
}
