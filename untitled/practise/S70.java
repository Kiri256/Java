package practise;

import java.util.ArrayList;

public class S70 {
    int run(int n){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(1);
        int i=3;
        while(i>=n){
            list.add(list.get(i-1)+ list.get(i-2));
            i++;
        }
        return list.get(n);
    }
}
