package jianzhi_offer;

public class ReverseWordsInSentence {

    public static String reverseSentence(String setence) {
        StringBuilder s = reverse(new StringBuilder(setence));
        String[] arr = s.toString().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s1 : arr) {
            sb.append(reverse(new StringBuilder(s1)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public static StringBuilder reverse(StringBuilder stringBuilder) {

        int begin = 0;
        int end = stringBuilder.length() - 1;
        while (begin < end) {
            char temp = stringBuilder.charAt(begin);
            stringBuilder.setCharAt(begin, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, temp);
            begin++;
            end--;
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello World");
        reverse(s);
        System.out.println(s.toString());
        System.out.println(reverseSentence("I am a student."));
    }
}
