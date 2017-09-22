/**
 * Created by jc225828 on 22/09/17.
 */
public class UsedBook
{
    public static void main(String[] args)
    {
        Fiction aNovel = new Fiction("How to Kill a Mockingbird");
        NonFiction aDictionary = new NonFiction("Webster");
        System.out.println("Fiction "+aNovel.getTitle() + " costs $"+aNovel.getPrice());
        System.out.println("Non-Fiction "+aDictionary.getTitle()+" costs $"+aDictionary.getPrice());
    }
}
