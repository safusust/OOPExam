package genericDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class CoustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CoustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    public int remove(){
        size--;
        int removed=data[size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int val){
        data[index]=val;
    }

    private  boolean isfull() {
        return size==data.length;
    }
    private void resize(){
        size= data.length*2;
        int [] temp= new int[size];
        for(int i:data){
            temp[i]=data[i];
        }
        data=temp;
    }

    @Override
    public String toString() {
        return "CoustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //       ArrayList list =new ArrayList();
//        list.add(5);
//        list.add(4);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        list.set(0,55);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        CoustomArrayList a=new CoustomArrayList();
        a.add(5);
        System.out.println(a);
    }
}
