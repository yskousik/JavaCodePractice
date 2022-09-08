public class QuickUnionUF{
    private int[] id;
    //construtor of array
    public QuickUnionUF(int N){
        super();
        id = new int[N];
        for(int i = 0; i<N ; i++){
            id[i] = i;
        }
    }
    public boolean connected(int p, int q){
        return (root(p) == root(q));
    }
    public int root(int i){
        while(i != id[i]){
            i = id[i];
        }
        return i;
    }
    public void union(int p, int q){
        int root1 = root(p);
        int root2 = root(q);
        id[root1] = root2;
    }
    public void printarray(){
        for(int i = 0; i<id.length ; i++){
            System.out.println(id[i]);
        }
    }
    public static void main(String [] args){
          QuickUnionUF qf = new QuickUnionUF(9);
          qf.printarray();
          qf.union(4, 7);
          if (qf.connected(6, 7)==true) {
            System.out.println("connected");
          }
          else{
            System.out.println("Not connected");
          }
          qf.printarray();
}
    
}