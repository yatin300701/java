public class Variable{
   
    public static void main(String[] args){
        // shared across all classes , change in it affect all instances of this class
        static int theme = "Restaurant";
        Jv.greetings(theme)

        Variable Jv = new Variable();
        Jv.greetings("Java");
        

        BreakFast bft = new BreakFast("Cuddy Chaval", 8);

    }

     public void greetings(String name){
           // local variables
          String greeting = "Hello";
        System.out.println(greeting+" "+name);
    }

    public static class BreakFast{
        // Instance variable -> belong to an obj (non static fields) -> automatically get default values
        String name; //null
        int timing; //0
        
        public  BreakFast(String name, int time){
            this.name = name;
            this.timing = time;
            System.out.println("You will be served "+name+" at "+time+"AM");
        }
    }

}