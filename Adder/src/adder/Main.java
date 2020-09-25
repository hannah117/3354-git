package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if(args[0].matches(".*[1-9].*") != true ||args[1].matches(".*[1-9].*") != true || args[2].matches(".*[1-9].*") != true){
                throw new IllegalArgumentException("Input must be integers");
            }
            System.err.println("Please provide three integers to add");
        }}

    private static int addArguments(String[] args) {
        if (args[0] == "-")
        {
            return (Integer.valueOf(args[1])*-1) + (Integer.valueOf(args[2])*-1) ;
        }
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
