

package Lab5;

        import java.lang.reflect.Array;
        import java.util.Arrays;
        import java.util.Collections;

// sorting คือ การเรียงลำดับข้อมูล
public class ArraySorting {
    public static void main(String[] args) {

        int number[] = {12,54,87,32,69};

        //ascending น้อย - มาก
        Arrays.sort(number);

        for (int val:number) {
            System.out.print(val+" ");
        }
        System.out.println();

        //descending มาก - น้อย
        Integer n[] = new Integer[number.length];
        int i = 0;
        for (int V:number) {
            n[i++] = Integer.valueOf(V);

        }
        Arrays.sort(n, Collections.reverseOrder());
        System.out.println(Arrays.toString(n));

        int x[][] = {{1,2,3},
                {4,5,6}};
        System.out.println(Arrays.toString(x[0]));
    }
}
