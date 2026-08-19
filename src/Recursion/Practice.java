package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Practice {
    void print(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        print(n-1);
    }
    int sum(int n){
        if(n == 0) return 0;
        return n + sum(n-1);
    }
    int fact(int n){
        if(n == 0) return 1;
        return n * fact(n-1);
    }
    int power(int a, int b){
        if(b == 0) return 1;
        int call = power(a,b/2);
        if(b % 2 == 0) return call * call;
        return  a * call * call;
    }
    int countDigits(int n){
        if(n < 10) return 1;
        return 1 + countDigits(n/10);
    }
    int sumDigits(int n){
        if(n == 0) return 0;
        return sumHelper(n, 0);
    }
    int sumHelper(int n, int sum) {
        if(n == 0) return sum;
        return sumHelper(n/10, sum + n % 10);
    }
    int productDigits(int n){
        if(n == 0) return 0;
        return productHelper(n, 1);
    }
    int productHelper(int n, int product) {
        if(n == 0) return product;
        return productHelper(n/10, product * (n % 10));
    }
    int reverse(int n){
        if(n == 0) return 0;
        return reverseHelper(n , 0);
    }
    int reverseHelper(int n, int r) {
        if(n == 0) return r;
        return reverseHelper(n/10, (r * 10) + (n % 10));
    }
    boolean isPalindrome(int n){
        if(n == 0) return true;
        return n == reverse(n);
    }
    boolean isSorted(int[] arr, int idx){
        if(arr.length -1 == idx) return true;
        if(arr[idx] > arr[idx + 1]) return false;
        return isSorted(arr,idx+1);
    }
    int firstOccurrence(int[] arr, int idx, int target){
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        return firstOccurrence(arr, idx+1, target);
    }
    int lastOccurrence(int[] arr, int idx, int target){
        if(idx < 0) return -1;
        if(arr[idx] == target) return idx;
        return lastOccurrence(arr, idx-1, target);
    }
    int max(int[] arr, int idx){
        if(idx == arr.length - 1) return arr[idx];
        return Math.max(arr[idx], max(arr, idx+1));
    }
    int min(int[] arr, int idx){
        if(idx == arr.length - 1) return arr[idx];
        return Math.min(arr[idx], min(arr, idx+1));
    }
    int count(int[] arr, int idx, int target){
        if(idx == arr.length) return 0;
        int c = 0;
        if(arr[idx] == target) c++;
        return c + count(arr, idx+1, target);
    }
    int sum(int[] arr, int idx){
        if(idx == arr.length) return 0;
        return arr[idx] + sum(arr, idx+1);
    }
    boolean contains(int[] arr, int idx, int target){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return contains(arr, idx+1, target);
    }
    int countEven(int[] arr, int idx){
        if(idx == arr.length) return 0;
        int c = 0;
        if(arr[idx] % 2 == 0) c++;
        return c + countEven(arr, idx+1);
    }
    int maxIndex(int[] arr, int idx){
        if(idx == arr.length-1) return idx;
        int rec = maxIndex(arr, idx + 1);
        if(arr[idx] > arr[rec]) return idx;
        return rec;
    }
    public static void main(String[] args) {

    }

}
