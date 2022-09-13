public class Alphabet {

    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()_+\\/~?";

    private final StringBuilder passwordPool;

    public Alphabet(boolean uppercaseIncluded, boolean  lowercaseIncluded, boolean numbersIncluded,
                    boolean symbolsIncluded) {

        passwordPool = new StringBuilder();

        if (uppercaseIncluded){
            passwordPool.append(UPPERCASE_LETTERS);
        }

        if (lowercaseIncluded) {
            passwordPool.append(LOWERCASE_LETTERS);
        }

        if(numbersIncluded){
            passwordPool.append(NUMBERS);
        }

        if(symbolsIncluded){
            passwordPool.append(SYMBOLS);
        }

        public String getAlphabet(){
            return passwordPool.toString();
        }
    }
}
