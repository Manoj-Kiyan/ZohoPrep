import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Vowel {
    public static void main(String[] args) {
        String name="ManojKiyan";
        Vowcount(name);
        RemoveVowels(name);

    }
    public static void Vowcount(String in){
        String input;
        input=in.toLowerCase();
        int count=0;
        Set<Character> VowelsFound=new HashSet<>();
        Map<Character,Integer>VowelMap=new HashMap<>();
        for (int i = 0; i <= input.length()-1; i++) {
            char ch=input.charAt(i);
            if(ch== 'a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
                VowelsFound.add(ch);
                VowelMap.put(ch, VowelMap.getOrDefault(ch, 0)+1);
            }
            
        }
        System.out.println("Vowels are in String is"+VowelsFound);
        System.out.println("Total Vowels in string:"+count);
        for(char Vowels:VowelMap.keySet()){
            System.out.println(Vowels +" is present in " +VowelMap.get(Vowels) + " Times ");

        }

    }

    public static void RemoveVowels(String in){
        StringBuilder vow=new StringBuilder();
        for (int i = 0; i < in.length()-1; i++) {
            char ch=in.charAt(i);
            char lower=Character.toLowerCase(ch);
            if(lower !='a' && lower !='e' && lower !='i' && lower !='o' && lower !='u'){
                vow.append(ch);
            }
        }
        System.out.println(vow);
    }
}
