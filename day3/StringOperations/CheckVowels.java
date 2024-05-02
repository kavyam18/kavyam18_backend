public class CheckVowels {
    public static boolean checkAllVowels(String str) {
        str = str.toLowerCase();
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' && ch == 'e' && ch == 'i' && ch == '0' && ch == 'u') {
             found=true;
        }
        return found;
    }

    public static void main(String[] args) {
        String str = "AnjaliMouna";
        boolean result = checkAllVowels(str);
        System.out.println("All vowels are present in the string: " + result);
    }
}
