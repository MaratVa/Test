public class svetofor {
        public static void main(String[] args) {
            char ch1 = 'r';
            char ch2 = 'y';
            char ch3 = 'g';

            System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
        }

        public static String decode(char ch) {

            String result = "";
            switch (ch) {
                case 'r':
                    result = "red";
                    break;
                case 'y':
                    result = "yellow";
                    break;
                case 'g':
                    result = "green";
                    break;
                default:
                    result = "I don’t know these symbols:(";
            }
            return result;
        }
    }

