public class Sentence {
    public static void main(String[] args) {
        String lines="MuthuKumaran is the title winner of BigBoss Season 8";
        //Reverse(lines);
        VowelsAndConsonent(lines);
    }

    public static void Reverse(String lines){
        String[] words=lines.split(" ");
        String reversed="";
       for (int i = words.length-1;i >= 0; i--) {
        reversed += words[i]+" ";
       }

       String biggest="";
       for(String word:words){
        if(word.length()>biggest.length()){
            biggest=word;
        }
       }
        System.out.println("The Reversed sentence is "+reversed);
        System.out.println("The biggest word from the Sentence is "+biggest+" that length is "+biggest.length());
    }
     public static void VowelsAndConsonent(String lines){
        String[] words=lines.split(" ");
        int count=0;
        int consonent=0;
        int digitcount=0;
        
        for(String word:words){
            for (int i = 0; i < word.length(); i++) {
                char ch=word.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }else if(Character.isLetter(ch)){
                    consonent++;
                }else if(Character.isDigit(ch)){
                    digitcount++;
                }
            }
            
        }
        System.out.println("Vowels Count: "+count);
        System.out.println("consonent :"+consonent);
        System.out.println("digitcount :"+digitcount);
        
    }
}
