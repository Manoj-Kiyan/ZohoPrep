class wordCount{
    public static void main(String[] args) {
        String str="Manoj Kiyan M";
        count(str);

    }
    public static void count(String str){
        str = str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(ch == ' ') continue;;
            int count=0;
            for (int i = 0; i <str.length(); i++) {
                
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            System.out.println("The word "+ch+"  present is "+count+" times");
        }
    }
}