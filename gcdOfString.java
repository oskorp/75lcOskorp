public class gcdOfString {
    public static void main(String[] args) {
        String s1= "OmOmOm";
        String s2 = "OmOm";
        System.out.println(code2(s1, s2));
        
    }

    public static String code2(String s1,String s2){
        if(s2.length()>s2.length()){
            return code2(s2, s1);
        }
        if(s1.equals(s2)){
            return s1;
        }
        if(s1.startsWith(s2)){
            return code2(s1.substring(s2.length()), s2);
        }

        return "";
    }
}
