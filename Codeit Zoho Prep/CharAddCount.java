import java.util.*;

public class CharAddCount {
    public static void main(String[] args) {
        String str="aabbcdddeeeee";
        System.out.println(AddChar(str));

    }

    public static StringBuilder AddChar(String str){
        HashMap <Character,Integer> frequengy=new LinkedHashMap<>();
        StringBuilder result=new StringBuilder(); 

        for (char ch : str.toCharArray()) {
            frequengy.put(ch, frequengy.getOrDefault(ch, 0)+1);
        }

        for(char ch:frequengy.keySet()){
            if(frequengy.get(ch) %2!=0){
                result.append(ch);

            }
            
        }
        return result;

        
    }
}
