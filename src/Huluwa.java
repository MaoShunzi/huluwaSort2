public class Huluwa {
    protected String name;
    protected String color;
    protected int rank;
    protected String mark;

    // 构造函数
    public Huluwa(String name, String color, int rank, String mark) {
        this.name = name;
        this.color = color;
        this.rank = rank;
        this.mark = mark;
    }
    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void reportName() {
        System.out.print(this.name + " ");
    }

    public void printSelf() {
        System.out.print(this.mark);
    }

}
