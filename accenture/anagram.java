import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.next());
        }
        Map<String,List<Integer>> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            char[] ch=list.get(i).toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(i+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> l:map.values()){
            if(l.size()>1){
                ans.add(l);
            }
        }
        System.out.println(ans);
    }
}
