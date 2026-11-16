import java.util.ArrayList;
import java.util.NoSuchElementException;
public class Implement_Min_Heap {
    public static void main(String[] args) {
        MinHeap<Integer> minHeap=new MinHeap<>();
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);
        System.out.println(minHeap.remove());
        System.out.println(minHeap.remove());
        System.out.println(minHeap.remove());
        System.out.println(minHeap.remove());
    }
}

class MinHeap<T extends Comparable<T>>{
 ArrayList<T> heap;
 MinHeap(){
        heap=new ArrayList<>();

    }
    public void swap(int first,int second){
        T temp=heap.get(first);
        heap.set(first, heap.get(second));
        heap.set(second, temp);
    }
    public int parent(int i){
        int parent=(i-1)/2;
        return parent;
    }
    public int left(int i){
        int left=2*i+1;
        return left;
    }
    public int right(int i){
        int right=2*i+2;
        return right;
    }
    public void insert(T value){
        heap.add(value);
        int i=heap.size()-1;
upheap(i);
    }
    public void upheap(int i){
        if(i==0) return;
        int parent=parent(i);
        if(heap.get(i).compareTo(heap.get(parent))<0){
            swap(i,parent);
            upheap(parent);
        }
    }
public T remove(){
    if(heap.size()==0) throw new NoSuchElementException("Heap is empty");
    T temp=heap.get(0);
    T last=heap.remove(heap.size()-1);
    if(heap.size()!=0) {
    heap.set(0, last);
    downheap(0);
    }
    return temp;
}
public void downheap(int i){
    int min=i;
    int left=left(i);
    int right=right(i);
    if(left<heap.size()&& heap.get(left).compareTo(heap.get(min))<0){
        min=left;
    }
    if(right<heap.size()&& heap.get(right).compareTo(heap.get(min))<0){
        min=right;
    }
    if(min!=i){
        swap(i,min);
        downheap(min);
    }
}
public ArrayList<T> minHeap(){
    ArrayList<T> sorted=new ArrayList<>();
    while(heap.size()>0){
        sorted.add(remove());
    }
    return sorted;}
}