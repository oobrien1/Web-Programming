package Algorithms;

public class list {
    public static void main(String[] args) {
        list S = new list();
        int [] L = {7, 3, 4, 0};
        S.insertionsort(L, 4);
    }

    public void insertionsort(int [] L, int n) {
        if (n >= 2) {
            System.out.println("insertionsort and n = " + n);
            System.out.println("List: " + L[0] +", " + L[1] +", " + L[2] + ", " + L[3]);
            insertionsort(L, n-1); 
            System.out.println("insert and n = " + n);
            System.out.println("List: " + L[0] +", " + L[1] +", " + L[2] + ", " + L[3]);
            insert(L, n);
        }
    }

    public void insert (int[]L, int k) {
        if (k>= 2) {
            if (L[k-2] > L[k-1]) {
                swap(L, k);
                insert(L, k-1);
            }
        }
    }

    public void swap(int[] L, int k) {
        int first = L[k-2];
        int second = L[k-1];
        L[k-2] = second;
        L[k-1] = first;
    }
}