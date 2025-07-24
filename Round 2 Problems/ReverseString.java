public class ReverseString {
    public static void main(String[] args) {
        String str="Manoj";
        System.out.println(reverse(str));
    }   
    public static String reverse(String in){
            String reversed="";
            for (int i = in.length()-1; i>=0; i--) {
                reversed+=in.charAt(i);
            }
            return  reversed;
        } 
}


//     public static void main(String[] args) {
//         String str="Manoj";
    
//             String reversed="";
//             for (int i = str.length()-1; i>=0; i--) {
//                 reversed+=str.charAt(i);
//             }
//             System.out.println(reversed);
//         } 
// }