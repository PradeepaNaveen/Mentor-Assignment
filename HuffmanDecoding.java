import java.util.*;
public class HuffmanDecoding {
    public static void main(String[] args) {
        HuffmanDecoding indexDecode = new HuffmanDecoding();
        indexDecode.huffmanCoding();
    }
    public void huffmanCoding()
    {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> mapIndex = new HashMap<>();
        System.out.println("Enter the input string:");
        String str = input.next();
        int firstIndex, secondIndex=0;
        char temp;
        String temp1;
        mapIndex.put('A', 0);
        mapIndex.put('B', 10);
        mapIndex.put('C', 110);
        mapIndex.put('D', 1110);
        mapIndex.put('E', 1111);
        int len = str.length();
        int j=0, count = 0;
        String key="";
        /*for (firstIndex = 0; firstIndex < len; firstIndex++) {          //Encoding the values in hashmap...
            temp = str.charAt(firstIndex);
            System.out.println(mapIndex.get(temp));
        }*/
        j= secondIndex;
        for (; secondIndex < len; secondIndex++) {

            temp1 = str.substring(j, secondIndex+ 1);
            if (mapIndex.containsValue(Integer.parseInt(temp1)))
            {
                for (Map.Entry m1 : mapIndex.entrySet()) {
                    if (m1.getValue() .equals( Integer.parseInt(temp1))) {
                        key = key +m1.getKey();
                        j = secondIndex+1;
                    }
                }
            }
        }
        System.out.println("The Decoded Values are:" +key);
    }
}
