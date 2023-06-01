public class Ternarnyioperator {
    public static void main(String args[]) {
        int variable = 7;
        if (variable > 10) {
            variable = variable - 10;
        } else {
            variable = variable + 10;
        }
        System.out.println(variable);
    }
    int variable = 7 > 10 ? - 10 : + 10;
}

