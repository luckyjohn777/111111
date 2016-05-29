/**
 * Created by evgenijdmitriev on 26.05.16.
 */
public class ArrayInsert {
    public static void main(String[] args) {
       Integer a = 100;
        ArrayInsert arr;
        arr = new ArrayInsert(a) ;

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.out();
        arr.insertionSort();
        arr.out();

    }
    private long[]a;
    private Integer nElems;

    private ArrayInsert(int max) {
       a =  new long[max];
        nElems = 0;
    }
    private void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    private void out(){
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
            System.out.println("");
        }
    }
    private void insertionSort(){
        int in;
        for (int i = 0; i < nElems; i++) {
            long temp = a[i];
            in = i;
            while (in>0 && a[in-1] >= temp){
                a[in] = a[in-1];
                in--;
            }
            a[in] = temp;
        }
    }
}
