class ex3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9');

        System.out.println(b);
    }
}
