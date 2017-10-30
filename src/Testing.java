public class Testing {
    public static void main(String[] args) {

//        Static st = new Static();
//        st.Hello();
        Static.Hello();
    }

    static class Static {
        public static void Hello(){
            System.out.println("Hello");
        }
}

}
