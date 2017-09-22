/**
 * Created by jc225828 on 22/09/17.
 */
public class Blanket
{
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;
    private final String Size1 = "Twin";
    private final String Size2 = "Double";
    private final String Size3 = "Queen";
    private final String Size4 = "King";
    protected final double BasePrice = 30;
    private final double SizePrice2 = 10;
    private final double SizePrice3 = 25;
    private final double SizePrice4 = 40;
    private final String Material1 = "cotton";
    private final String Material2 = "wool";
    private final String Material3 = "cashmere";
    private final double MatPrice2 = 20;
    private final double MatPrice3 = 45;
    public Blanket()
    {
        setDefaults();
    }
    private void setDefaults()
    {
        size = Size1;
        color = "white";
        material = Material1;
        sizePremium = 0;
        materialPremium = 0;
        price = BasePrice;
    }
    public String getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
    public String getMaterial()
    {
        return material;
    }
    public void setSize(String y)
    {
        size = y;
        if (y.equals(Size1))
            sizePremium = 0;
        else
            if (y.equals(Size2))
                sizePremium = SizePrice2;
            else
                if (y.equals(Size3))
                    sizePremium = SizePrice3;
                else
                    if (y.equals(Size4))
                        sizePremium = SizePrice4;
                    else
                        setDefaults();
        price = BasePrice + sizePremium + materialPremium;
    }
    public void setMaterial(String m)
    {
        material = m;
        if(m.equals(Material1))
            materialPremium = 0;
            else
                if(m.equals(Material2))
                    materialPremium = MatPrice2;
                else
                    if(m.equals(Material3))
                        materialPremium = MatPrice3;
                    else
                        setDefaults();
        price = BasePrice + sizePremium + materialPremium;
    }
    public String toString()
    {
        return size + " size " + material + " blanket. Price $" + price;
    }
}
