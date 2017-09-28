/**
 * Created by jc225828 on 29/09/17.
 */
public abstract class Element
{
    String symbol;
    int AtomicNumber;
    double AtomicWeight;
    public Element(String s, int anumber, double aweight)
    {
        symbol = s;
        AtomicNumber = anumber;
        AtomicWeight = aweight;
    }
    public String getSymbol()
    {
        return symbol;
    }
    public int getAtomicNumber()
    {
        return AtomicNumber;
    }
    public double getAtomicWeight()
    {
        return AtomicWeight;
    }
    public abstract void describeElement();
}
