class vowelsStartingWord {
    public static void main(String[] args) {
        String str = "All Geek in one house";
        String str1 = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == ' ' && isVowel(str1.charAt(i + 1))) {
                count++;
            }
        }
         if (isVowel(str1.charAt(0))) {
                count++;
            }

        System.out.println(count);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
