public class shadowing {
    static int c=90; // this is shadowed by line number 8

        public static void main(String[] args)
    {
        System.out.println(c);

           int c=40;
           System.out.println(c);
           func(c);

    }
   
    
     static void func(int c) {
        System.out.println(c);
     }

}
