public class Scorpion {
    protected String name;
    protected String mark;

    public Scorpion(String name,String mark) {
        this.name = name;
        this.mark = mark;
    }

    public void printSelf() {
        System.out.print(this.mark);
    }
}
