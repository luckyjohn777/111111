
/**
 * Created by evgenijdmitriev on 25.05.16.
 */
public class ArraySel {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        arr.insert(43);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(56);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(23);
        arr.insert(33);

        arr.out();
        arr.selectionSort();
        arr.out();
    }
    private long[] a;
    private int nElems;
    public ArraySel(int max){
        a = new long[max];
        nElems = 0;
    }
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    public void out(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("");
    }
    public void selectionSort(){
        int min;
        for (int i = 0; i < nElems-1; i++) {
            min=i;
            for (int j = i+1; j < nElems; j++)
                if (a[j]<a[min])
                    min=j;
            shift(i,min);
        }
    }
    private void shift(int one,int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}



