class Vowels {
    public static void main(String[] args) {
        String name = "fathima";

        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print(ch + " ");
            }
        }
    }
}