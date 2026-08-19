package OOPS;
class Arraylist{ // user defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){ // arr is full
            CapacityIncrease();
        }
        arr[idx++] = ele;
        size++;
    }
    void CapacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){ // Copy and Paste
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
    void RemoveFromEnd(){
        idx--;
        size--;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index, int value){
        arr[index] = value;
    }
    void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ownArrayList {
    public static void main(String[] args) {
        Arraylist ans = new Arraylist(8);
    }
}
