import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
public class task1 {

    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        String name = "";
        String number = "";
        Scanner scan = new Scanner(System.in);
        while (!name.equals("stop")){
            System.out.print("Введите имя: ");
            name = scan.nextLine();
            if (!name.equals("stop")) {
                System.out.print("Введите телефон: ");
                number = scan.nextLine();
                contacts.put(number, name);    
            }      
        }
        scan.close();
        System.out.println();
        for (var items : contacts.entrySet()) {
            System.out.println(items.getValue() + ": " + items.getKey());
        }
    }
}