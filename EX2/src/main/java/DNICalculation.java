public class DNICalculation {

    private int number;

    private final char[] letters = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public DNICalculation(int number) {
        if (number < 0 || number > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99,999,999");
        }
        this.number = number;
    }

    public char calculateLetter() {
        int remainder = number % 23;
        return letters[remainder];
    }

    public String getFullDNI() {
        return number + " " + calculateLetter();
    }


}
