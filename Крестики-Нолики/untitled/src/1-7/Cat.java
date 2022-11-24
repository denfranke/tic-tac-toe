public class Cat {
    private String name;
    private int appetite;
    public boolean sit;

    public Cat(String name, int a) {
        this.name = name;
        this.appetite = a;
        sit=false;
    }

    public void eat(Plate p) {
        this.sit=p.decreaseFood(this.appetite, this.sit);
    }

    public void info(Plate p) {
        System.out.println(p.info()+'\n');
        System.out.println(name+ " sit: " + sit);
    }
}
