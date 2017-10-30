public class Flag {
    public static void main(String[] args) {
        printFlag();
        String s = "Tesss";
        if(s.length()>=20){

            System.out.println("Üle 20");

        }
        else {
            System.out.println("Alla 20");
        }
        System.out.println(s.length());
    }

    private static void printFlag() {
        System.out.println("Tere");
    }

}
