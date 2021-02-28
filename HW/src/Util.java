import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <T> void swapElements(T[] inArr, int a, int b){
        T tmpVal = inArr[a];
        inArr[a] = inArr[b];
        inArr[b] = tmpVal;
    }

    public static <T> List<T> arrayToList(T[] inArr){
        List<T> resultList = new ArrayList<>();
//        for (int i = 0; i < inArr.length; i++) {
//            resultList.add(inArr[i]);
//        }
        for (T t : inArr) {
            resultList.add(t);
        }


        return resultList;
    }

    public static <T> boolean ClassCompare(T valA, T valB){
        return (valA.getClass().equals(valB.getClass()));
    }

}