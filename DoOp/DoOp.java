public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "it depend on the input.";
        }
        switch (args[1]) {
            case "+":
                return Integer.toString(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
            case "-":
                return Integer.toString(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
            case "*":
                return Integer.toString(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
            case "/":
                if (Integer.parseInt(args[2]) == 0)
                    return "Error";
                return Integer.toString(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
            case "%":
                if (Integer.parseInt(args[2]) == 0)
                    return "Error";
                return Integer.toString(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
            default:
                return "";
        }
    }
}