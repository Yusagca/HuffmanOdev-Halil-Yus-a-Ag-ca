//HALİL YUŞA AĞCA/02210201061
package huffmanodev;

public class Huffman {

    public static void yazdir(HuffmanList sayi, String s) {
        if (sayi.sol == null && sayi.sag == null && Character.isLetter(sayi.c)) {

            System.out.println(sayi.c + "------>" + s);

            return;
        }
        yazdir(sayi.sol, s + "0");
        yazdir(sayi.sag, s + "1");
    }
}
