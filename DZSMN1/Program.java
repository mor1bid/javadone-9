package DZSMN1;
import java.util.*;

public class Program
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Введите желаемый параметр поиска (название\\год выпуска\\режиссёр): ");
        String myName = work.nextLine();
        Filmname me = new Filmname(myName);
        work.close();
        System.out.println();
    }
}
