class ex4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum < 100) {
            i = (i > 0 ? -i-1 : -i+1);
            sum += i;
        }

        System.out.println(i);
    }
}
