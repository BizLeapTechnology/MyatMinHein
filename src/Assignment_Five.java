import java.util.Arrays;
import java.util.List;

/**
 * Created by M2h_Laptop on 2/7/2018.
 */
public class Assignment_Five {
    public static void main(String[] args) {
        String[] arrstr = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        int arr[]=new int[arrstr.length];

        for(int i=0;i<arrstr.length;i++)
        {
            arr[i]=Integer.parseInt(arrstr[i]);
            if(arr[i] % 3 == 0){
                arrstr[i] += " Biz";
            }
            if(arr[i] % 5 == 0){
                arrstr[i] += " leap";
            }
            else if(arr[i] % 3 == 0 && arr[i] % 5 == 0){
                arrstr[i] += " BizLeap";
            }
            System.out.println(arrstr[i]);
        }
    }
}
