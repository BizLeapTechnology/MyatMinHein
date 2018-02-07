import java.util.Arrays;
import java.util.List;

/**
 * Created by M2h_Laptop on 2/7/2018.
 */
public class Assignment_Five {
    public static void main(String[] args) {
        String[] arrstr = new String[100];
        int[] temp = new int[20];
        int[] array = Arrays.asList(arrstr).stream().mapToInt(Integer::parseInt).toArray();
    }
}
