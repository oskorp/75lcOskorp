class mergeAlternately {
    public static void main(String[] args) {
        String s1 = "omk";
        String s2 = "Kha";
        System.out.println(code1(s1,s2));
    }

    public static String code1(String s1, String s2) {

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length()) {
                string.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                string.append(s2.charAt(i));
            }
        }
        return string.toString();

    }

}
