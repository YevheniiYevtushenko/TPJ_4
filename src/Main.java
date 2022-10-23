public class Main {
    public static void main(String[] args) {
        //Character.isUpperCase('t') перевіряє чи знаходиться символ у верхньому регістрі
        System.out.println(Character.isUpperCase('t'));
        System.out.println(Character.isUpperCase('T'));
        System.out.println(" " + "\uD83D\uDE80" + " " + "\uD83D\uDE37" + " " + "\uD83D\uDE2B");
        char s1 = (char)((Math.random() * (65535 - 32)) + 0);
        char s2 = (char)((Math.random() * (65535 - 32)) + 0);
        int res = Character.compare(s1, s2);
        if(res > 0) System.out.println(s1 + " > " + s2);
        else if(res < 0) System.out.println(s1 + " < " + s2);
        else System.out.println(s1 + " = " + s2);
    }
}