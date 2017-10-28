public class World {
    private String level =
            "";
    Huluwa hulu0, hulu1, hulu2, hulu3, hulu4, hulu5, hulu6;
    Underlings louluo;
    Underlings louluo0,louluo1,louluo2,louluo3,louluo4,louluo5;
    Grandpa yeye;
    Scorpion xiezi;
    Snake shejing;

    public void printAll(String str) {
        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            if (item == '\n') {
                System.out.print('\n');
            } else if (item == '.') {
                System.out.print("—");
            } else if (item == 'G') {
                yeye.printSelf();
            }else if(item=='S') {
                shejing.printSelf();
            }else if(item=='C') {
                xiezi.printSelf();
            }else if(item=='U') {
                louluo.printSelf();
            }else if(item=='0') {
                hulu0.printSelf();
            } else if(item=='1') {
                hulu1.printSelf();
            } else if(item=='2') {
                hulu2.printSelf();
            } else if(item=='3') {
                hulu3.printSelf();
            } else if(item=='4') {
                hulu4.printSelf();
            } else if(item=='5') {
                hulu5.printSelf();
            } else if(item=='6') {
                hulu6.printSelf();
            } else if (item == ' ') {
            }
        }
    }

    public void init() {
        //    ArrayList<Huluwa> huluwas = new ArrayList();
        yeye = new Grandpa("爷爷","爷");
        xiezi = new Scorpion("蝎子精","蝎");
        shejing = new Snake("蛇精","蛇");
        louluo = new Underlings("小喽啰","喽");
        hulu0 = new Huluwa("老大", "赤", 0, "①");
        hulu1 = new Huluwa("老二", "橙", 1, "②");
        hulu2 = new Huluwa("老三", "黄", 2, "③");
        hulu3 = new Huluwa("老四", "绿", 3, "④");
        hulu4 = new Huluwa("老五", "青", 4, "⑤");
        hulu5 = new Huluwa("老六", "蓝", 5, "⑥");
        hulu6 = new Huluwa("老七", "紫", 6, "⑦");

        Huluwa huluwas[] = {hulu0, hulu1, hulu2, hulu3, hulu4, hulu5, hulu6};
        yeye.huluwas = huluwas;
        yeye.line();
        String HuluwaForm = Grandpa.chooseFormation();
        String SnakeForm1 = Snake.chooseFormation();
        System.out.println("葫芦娃站队：");
        printAll(HuluwaForm);

        System.out.println("蝎子精小喽啰站队：");
        printAll(SnakeForm1);

        Huluwa hulu;

        System.out.println("对峙局面：");
        for(int i  = 0; i < (20 + 1) * 12; i++){
            if(i % (20 + 1) >= 0 && i % (20 + 1) < 10) {
                level += HuluwaForm.charAt(i);
            }
            else level += SnakeForm1.charAt(i);
        }
        printAll(level);

        System.out.println("蝎子精小喽啰阵营变换：");
        String SnakeForm2 = Snake.chooseFormation();
        while(SnakeForm2==SnakeForm1){
            SnakeForm2 = Snake.chooseFormation();
        }
        printAll(SnakeForm2);

        System.out.println("新的对峙局面：");
        level="";
        for(int i  = 0; i < (20 + 1) * 12; i++){
            if(i % (20 + 1) >= 0 && i % (20 + 1) < 10) {
                level += HuluwaForm.charAt(i);
            }
            else level += SnakeForm2.charAt(i);
        }
        printAll(level);
    }
}
