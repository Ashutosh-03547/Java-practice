public class q10 {
    public static boolean strsame(String s1, String s2) {
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        if (strsame(s1, s2)) {
            System.out.println("same string");
            
        } else {
            System.out.println("not same string");
        }
    }
}
