/**
 * Created by jc225828 on 29/09/17.
 */
public class NonMetalElement extends Element
{
    public NonMetalElement(String s, int aNumber, double aWeight)
    {
        super(s, aNumber, aWeight);
    }
    public void describeElement()
    {
        System.out.println("A non-metal element, like " + getSymbol() + "with an atomic number "+getAtomicNumber()+ " and an atomic" +
                " weight of "+getAtomicWeight()+ " is a por conductor of electricity.");
    }
}