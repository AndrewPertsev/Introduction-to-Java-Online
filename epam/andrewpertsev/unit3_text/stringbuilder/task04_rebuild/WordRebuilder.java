package epam.andrewpertsev.unit3_text.stringbuilder.task04_rebuild;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class WordRebuilder {
    public static void main(String[] args) {
        String word = "информатика";
        int indexT;
        int indexOP;

        StringBuilder cake = new StringBuilder();
        StringBuilder builder = new StringBuilder(word);

        indexT = builder.indexOf("т");
        indexOP = builder.indexOf("ор");

        cake.append(builder.charAt(indexT))
                .append(builder.substring(indexOP, indexOP + 2))
                .append(builder.charAt(indexT));

        System.out.println("Result : " + cake);


    }
}
