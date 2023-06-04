package String;

public class Document {

    public static void getTwoBlocks(String documentNew) {
        String[] blocks = documentNew.split("-");
        System.out.println("First two blocks: " + blocks[0] + ("-") + blocks[2]);
        System.out.println();
    }

    public static void getNumberDocument(String documentNew) {
        String[] parts = documentNew.split("-");
        String num = (parts[1].replaceAll("qwe", "***"));
        String num1 = (parts[3].replaceAll("abc", "***"));
        System.out.println("Number of Document: " + parts[0] + ("-") + num + ("-") + parts[2] + ("-") + num1 + ("-") +
                parts[4]);
        System.out.println();
    }
        public static void printLowerLetters(String documentNew) {
            String[] letter = documentNew.split("-");
            String let = letter[1].toLowerCase();
            String let1 = letter[3].toLowerCase();
            String let2 = letter[4].toLowerCase().substring(1,2);
            String let3 = letter[4].toLowerCase().substring(3,4);
            String print = let + "/" + let1 + "/" + let2 + "/"+ let3 + "/";
            System.out.println("Lowercase Letters: " + print);
            System.out.println();
        }

    public static void printUpperLetters(String documentNew) {
        StringBuilder str  = new StringBuilder("1234-fgh-3333-cVb-5p4P");
//        Метод substring() в Java возвращает новую строку,
//        которая является подстрокой данной строки.
//        Подстрока начинается с символа, заданного индексом,
//        и продолжается до конца данной строки или до endIndex-1 ,если введен второй аргумент.
        String num = str.substring(5,8);
        String num1 = str.substring(14,17);
        char num2 = str.charAt(19);
        char num3 = str.charAt(21);
        String print = num + "/" + num1 + "/" + num2 + "/"+ num3 + "/";
        System.out.println("Uppercase Letters: " + print.toUpperCase());
        System.out.println();
    }
//
    public static void checkAbc(String documentNew) {
        boolean checkAbc = documentNew.contains("abc")||documentNew.contains("ABC");
        System.out.println("Contains abc/ABC : " + checkAbc);
        System.out.println();
    }
//    Метод startsWith() помогает определить,
//    начинается ли строка с символов указанных в скобках,
//    возвращая, соответственно, true или false
    public static void getStartsWith555 (String documentNew) {
        boolean check555 = documentNew.startsWith("555");
        System.out.println("Starts 555 : " + check555);
        System.out.println();
    }
    public static void getEndWith1a2b (String documentNew) {
        boolean check1a2b = documentNew.endsWith("1a2b");
        System.out.println("Ends 1a2b : " + check1a2b);
    }
    }
