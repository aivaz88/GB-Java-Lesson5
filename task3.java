import java.util.HashMap;
import java.util.Map;

/*
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.
 */
public class task3 {
    public static void main(String[] args) {
        Map<Integer, Integer[]> hashmap = new HashMap<Integer, Integer[]>();
        Integer[][] board = new Integer[8][8];
        Integer count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                count++;
                board[i][j] = count;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                Integer[] array = new Integer[] {i, j};
                hashmap.put(board[i][j], array);
            }
        }
        for (var item : hashmap.entrySet()) {
            if (item.getValue() != null) {
                int x = item.getValue()[0];
                int y = item.getValue()[1];
                for (var item1 : hashmap.entrySet()) {
                    if (item1.getValue() != null) {
                        int x1 = item1.getValue()[0]; 
                        int y1 = item1.getValue()[1];
                        if (!(x == x1 && y == y1)){
                            if (x == x1 || y == y1 || (Math.abs(x1-x) == Math.abs(y1-y))){
                                hashmap.put(item1.getKey(), null);
                            }
                        }
                    }
                }
            }            
        }
        for (var item : hashmap.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());            
        }
    }
}
