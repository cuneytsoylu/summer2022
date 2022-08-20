package calısma;

import java.util.ArrayList;
import java.util.List;

public class d {
    public static void main(String[] args) {
        String str="cöz beni";

        String[] arr=str.split("");

        List<String> list = new ArrayList<>();
        for (String each:arr
             ) {
            list.add(each);}
        System.out.println(list);
        }

    }

