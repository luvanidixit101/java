class gettermethid {

    private int a = 1000;

    private int getA() {
        return a;
    }

    public static void main(String[] args) {
        gettermethid obj = new gettermethid();

        obj.getA();
        System.out.println("a = " + obj.getA());
    }
}