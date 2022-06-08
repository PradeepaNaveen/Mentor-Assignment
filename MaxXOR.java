import java.util.*;
public class MaxXOR {
    public static void main(String[] args) {
        int maxCount =0,temp;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> indexList = new ArrayList<>();
        System.out.print("Enter the size:");
        int size = input.nextInt();
        for(int i=0;i<size;i++) {
            indexList.add(input.nextInt());
        }
        System.out.println("The elements in the list are:");
        System.out.println(indexList);
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                temp = indexList.get(i)^indexList.get(j);
                if(maxCount<temp)
                    maxCount = temp;
            }
        }
        System.out.println("Max XOR is:" + maxCount);
    }
}
