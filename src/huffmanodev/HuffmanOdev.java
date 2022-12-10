//HALİL YUŞA AĞCA/02210201061

package huffmanodev;

import java.util.PriorityQueue;
import java.util.Comparator;

class ImplementComparator implements Comparator<HuffmanList> {

    public int compare(HuffmanList x, HuffmanList y) {
        return x.data - y.data;
    }
}

public class HuffmanOdev {

    public static void main(String[] args) {

        char[] harfList = {'Y', 'U', 'S', 'A', 'G', 'C', 'B', 'M'};
        int[] harfDeg = {4, 8, 11, 3, 1, 7, 5, 9};
        int n = harfList.length;

        PriorityQueue<HuffmanList> q = new PriorityQueue<HuffmanList>(n, new ImplementComparator());

        for (int i = 0; i < n; i++) {
            HuffmanList hn = new HuffmanList();

            hn.c = harfList[i];
            hn.data = harfDeg[i];

            hn.sol = null;
            hn.sag = null;

            q.add(hn);
        }

        HuffmanList data = null;

        while (q.size() > 1) {

            HuffmanList x = q.peek();
            q.poll();

            HuffmanList y = q.peek();
            q.poll();

            HuffmanList f = new HuffmanList();

            f.data = x.data + y.data;
            f.c = '-';
            f.sol = x;
            f.sag = y;
            data = f;

            q.add(f);
        }
        System.out.println(" Harf  Huffman Kodu ");
        Huffman.yazdir(data, "");
    }
}
