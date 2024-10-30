package practise;

import java.util.ArrayList;
import java.util.List;

public class S94 {
    static Node root;
    static List<Integer> list=new ArrayList<>();
    public static List<Integer> run(){
        traversal(root);
        return list;
    }
    static Node traversal(Node node){
        if(node==null)return null;
        traversal(node.left);
        list.add(node.val);
        traversal(node.right);
        return node;
    }
}
