// An array for different boat types
public class FixDebugEleven2
{
   public static void main(String[] args)
   {
      FixDebugBoat[] ref = new FixDebugBoat[3];
      FixDebugRowboat blueBoat = new FixDebugRowboat();
      FixDebugRowboat redBoat = new FixDebugRowboat();
      FixDebugOceanLiner bigBoat = new FixDebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[1] = bigBoat;
      for(int x = 0; x < ref.length; ++x)
      {
         ref[x].setPassengers();
         ref[x].setPower();
         ref[x].toString();
      }
   }
}
