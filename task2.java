import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

import javax.management.ValueExp;

/**
 * Пусть дан список сотрудников
* Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
* Отсортировать по убыванию популярности Имени.
 */
public class task2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap = new TreeMap<>();
        ArrayList<String> array = new ArrayList<>();
        String[] name = new String[2];
        String[] name1 = new String[2];
        int count = 1;
        array.add("Иван Иванов");
        array.add("Светлана Петрова");
        array.add("Кристина Белова");
        array.add("Анна Мусина");
        array.add("Анна Крутова");
        array.add("Иван Юрин");
        array.add("Петр Лыков");
        array.add("Павел Чернов");
        array.add("Петр Чернышов");
        array.add("Мария Федорова");
        array.add("Марина Светлова");
        array.add("Мария Савина");
        array.add("Мария Рыкова");
        array.add("Марина Лугова");
        array.add("Анна Владимирова");
        array.add("Иван Мечников");
        array.add("Петр Петин");
        array.add("Иван Ежов");
        for (int i = 0; i < array.size(); i++) {
            name = array.get(i).split(" ");
            if (!treemap.containsKey(name[0])){
                for (int j = i+1; j < array.size(); j++) {
                    name1 = array.get(j).split(" ");
                    if (name[0].equals(name1[0])){
                        count++;
                    }
                }
                if (count > 1){
                    treemap.put(name[0], count);
                    count =1;
                }
            }
        }
        count = 0;
        for (int i : treemap.values()){
            if (i > count) count = i;
        }
        for (int i = count; i > 0; i--) {
            for (var item : treemap.entrySet()) {
                if (item.getValue().equals(i)){
                    System.out.println(item.getKey() + ": " + item.getValue());
                }
            }
        }
    }
}
