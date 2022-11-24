public class Plate {
    public int food;
    public Plate(){
        this.food=100;
    }
    public boolean decreaseFood(int a ,boolean sit){
        if(food-a>=0){
            this.food-=a;
            return true;
        }
        else {
            System.out.println("Недостаточно еды на тарелке");
            return false;
        }
    }

    public void addfood(int food){
        this.food+=food;
    }

    public int info() {
        //System.out.println("plate: " + food);
        return this.food;
    }
}
