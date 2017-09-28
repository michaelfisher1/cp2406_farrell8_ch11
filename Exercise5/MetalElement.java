/**
 * Created by jc225828 on 29/09/17.
 */
public class MetalElement extends Element
{
    public MetalElement(String s, int aNumber, double aWeight)
    {
        super(s, aNumber, aWeight);
    }
    public void describeElement()
    {
        System.out.println("A metal element, like " + getSymbol() + "with an atomic number "+getAtomicNumber()+ " and an atomic" +
                " weight of "+getAtomicWeight()+ " is a good conductor of electricity.");
    }
}
