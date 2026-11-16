class Construct_graph{
    static void add(int[][] graph,int i,int j){
        graph[i][j]=1;
        graph[j][i]=1;
    }
    public static void main(String[] args){
    int v=5;
    int[][] graph = new int[v+1][v+1];
    add(graph,2,3);
    add(graph,1,2);
    add(graph,1,5);
    add(graph,2,4);
    add(graph,5,4);
    System.out.print("  ");
    for(int i=0;i<=v;i++){
        System.out.print(i + " ");}
        System.out.println();
    for(int i=0;i<=v;i++){
        System.out.print(i + " ");
        for(int j=0;j<=v;j++){
            System.out.print(graph[i][j] + " ");
        }
        System.out.println();
    }
    }
    }