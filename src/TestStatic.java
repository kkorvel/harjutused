public class TestStatic {
    public static void main(String[] args) {

        Testing test = new Testing();
        test.doStuff();
    }
    static class Testing {
        public void doStuff(){
            System.out.println("Hello");

        }
    }
}
