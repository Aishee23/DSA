public class Staticconcept {
    class Test{
    String name;
     
    public Test(String name)
    {
        this.name=name;
    }
    public static void main(String[] args)
    {
        Test a=new Test("Aishee");
        Test b=new Test("Munu");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
/*class Test{
   static String name; //it will show munu 2 times as first changed to aishee then to munu now when we are asking for the name its only munu since name is declared as static
     
    public Test(String name)
    {
        this.name=name;
    }
}*/
