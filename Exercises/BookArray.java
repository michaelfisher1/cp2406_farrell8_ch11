/**
 * Created by jc225828 on 22/09/17.
 */
public class BookArray
{
    public static void main(String[] args)
    {
        Book aBook[] = new Book[5];
        int x;
        aBook[0] = new Fiction("Fool Moon");
        aBook[1] = new NonFiction("History of Jazz");
        aBook[2] = new Fiction("Summer Knight");
        aBook[3] = new NonFiction("The South Will Rise");
        aBook[4] = new Fiction("Changes");
        for(x = 0; x < aBook.length; ++x)
            System.out.println("Book: " + aBook[x].getTitle()+" costs $" + aBook[x].getPrice());
    }
}
