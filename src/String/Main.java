package String;

public class Main {
    public static void main(String[] args) {
        String documentNew = "4589-qwe-1111-abc-1u2u";

        Document.getTwoBlocks(documentNew);
        Document.getNumberDocument(documentNew);
        Document.printLowerLetters(documentNew);
        Document.printUpperLetters(documentNew);
        Document.checkAbc(documentNew);
        Document.getStartsWith555(documentNew);
        Document. getEndWith1a2b(documentNew);
    }
}
