//Hackerrank Program--->Strings
Medium:ACMICP TEAM




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        int max=0,count=1, teamAttendee =0,prevMax = 0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<topic.size();i++)
        {
            for(int j=i+1;j<topic.size();j++)
            {
                for(int k=0;k<topic.get(i).length();k++ )
                {
                    if(topic.get(i).charAt(k)!='0' || topic.get(j).charAt(k)!='0'){
                        teamAttendee++;
                    }
                }
                if(max<teamAttendee)
                {
                    max = teamAttendee;
                    count =1;
                }
                else if(max == teamAttendee)
                {
                    count++;
                    //System.out.print(count + " ");
                }
                teamAttendee=0;
            }
            if(prevMax<max)
                prevMax = max;
        }
        result.add(prevMax);
        result.add(count);
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String topicItem = bufferedReader.readLine();
            topic.add(topicItem);
        }

        List<Integer> result = Result.acmTeam(topic);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
