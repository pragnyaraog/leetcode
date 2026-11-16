import java.util.*;
public class Graph_addlist {
    static void add(int u,int v, ArrayList<ArrayList<Integer>> graph){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=v;i++){
            graph.add(new ArrayList<>());
        }
        add(2,3,graph);
        add(1,2,graph);
        add(1,5,graph);
        add(2,4,graph);
        add(5,4,graph);
        for(int i=0;i<=v;i++){
        System.out.println(i+"->"+graph.get(i));}
    }
}
