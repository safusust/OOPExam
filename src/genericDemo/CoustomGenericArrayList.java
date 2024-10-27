package genericDemo;

import java.util.Arrays;

public class CoustomGenericArrayList <T>{

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CoustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    public T remove(){
        size--;
        T removed=(T)data[size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, T val){
        data[index]=val;
    }

    private  boolean isfull() {
        return size==data.length;
    }
    private void resize(){
        Object [] temp= new Object[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data) + "" ;
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
//        CoustomGenericArrayList a=new CoustomGenericArrayList();
//        a.add(5);
//        System.out.println(a);
        CoustomGenericArrayList<Integer>list4= new CoustomGenericArrayList<>();
        for(int i=0;i<14;i++){
            list4.add(i);
        }
        System.out.println(list4);
    }
}
