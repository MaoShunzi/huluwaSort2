import java.util.Random;

public class Grandpa {
    protected String name;
    protected String mark;
    // 构造函数
    public Grandpa(String name,String mark) {
        this.name = name;
        this.mark = mark;
    }
    public Huluwa huluwas[]={};
    protected final static String changshe =
            "....................\n" +
                    "....................\n" +
                    ".0..................\n" +
                    ".1..................\n" +
                    ".2..................\n" +
                    "G3..................\n" +
                    ".4..................\n" +
                    ".5..................\n" +
                    ".6..................\n" +
                    "....................\n" +
                    "....................\n" +
                    "....................\n";

    protected static String formation;
    public static String chooseFormation() {
        formation = changshe;
        return formation;
    }

    public void line() {
        int index;
        Huluwa temp;
        for(int i = 0 ;i < huluwas.length ;i++){
            index = new Random().nextInt(4);
            temp = huluwas[i];
            huluwas[i] = huluwas[index];
            huluwas[index] = temp;
        }
    }

    public void printSelf() {
        System.out.print(this.mark);
    }
}
