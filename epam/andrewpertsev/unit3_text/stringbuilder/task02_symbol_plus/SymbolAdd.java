package epam.andrewpertsev.unit3_text.stringbuilder.task02_symbol_plus;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class SymbolAdd {
    public static void main(String[] args) {
        char charOff = 'a';
        String insertChar = "ab";
        String text = "at bay from au dhai in cariolet.";

        System.out.println(" Initial Text : "+ text);
        System.out.println(" Text after : " + insertChars(text, charOff, insertChar) );

    }

    public static StringBuilder insertChars(String text, char charOff, String insertChar) {
        StringBuilder builder = new StringBuilder(text);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == charOff) {
                builder.replace(i, i + 1, insertChar);
            }
        }
        return builder;
    }
}
