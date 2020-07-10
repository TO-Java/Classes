package L20200709;

public class Str {

    public static void main(String[] args) {

        String s1 = "Good Morning d";
        System.out.println(s1);
        String s2 = s1 + " " + s1;
        System.out.println(s2);

        char[] charArray = {'G', 'o', 'o', 'd'};
        for (int i = 0; i < charArray.length; ++i) {
            System.out.print(charArray[i]);
        }
        System.out.println();

        for (int i = 0; i < s1.length(); ++i) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf('d'));
        System.out.println(s1.indexOf('d', 4));
        System.out.println(s1.indexOf(" M"));
        System.out.println(s1.indexOf("  "));
        System.out.println(s1.substring(5, 12));
        System.out.println(s1.substring(5, s1.length()));
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0, 4) + s1.substring(5));
        System.out.println(extract(s1, 4));
        System.out.println(substitute(s1, 4, 'X'));
        System.out.println(s1);
        System.out.println(count(s1, 'o'));
        System.out.println(replaceAll(s1, 'o', 'X'));
    }

    public static String extract(String s, int idx) {

        return s.substring(0, idx) + s.substring(idx + 1);
    }

    public static String substitute(String s, int idx, char ch) {
        return s.substring(0, idx) + ch + s.substring(idx + 1);
    }

    public static int count(String s, char chr) {
        int acc = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == chr) {
                ++acc;
            }
        }
        return acc;
    }

    public static String replaceAll(String s, char ch1, char ch2) {
        String acc = "";
        for (int i = 0; i < s.length(); ++i) {
            char temp = s.charAt(i);
            if (temp == ch1) {
                acc += ch2;
            } else {
                acc += temp;
            }
        }
        return acc;
    }
}
