package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if(args[0].contains("[a-zA-Z]+")!=false ||args[1].contains("[a-zA-Z]+")!=false ||args[2].contains("[a-zA-Z]+")!=false){
                throw new IllegalArgumentException("Input must be integers");
            }
            if(args[0] == null ||args[1] == null ||args[2] == null )
            {
                throw new IllegalArgumentException("Must have 3 inputs");
            }
         
        }}

    private static int addArguments(String[] args) {
        if (args[0].equals("-"))
        { 
            return (Integer.valueOf(args[1])*-1) + (Integer.valueOf(args[2])*-1) ;
        }
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
