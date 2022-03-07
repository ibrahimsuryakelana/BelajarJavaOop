package tutorial;

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    // Getter
    public double getHealth(){
        return this.health;
    }

    // Setter
    final void SetHealth(double newHealth){
        this.health = newHealth;
    }

    // bisa dioverload
    public void setHealth(String mode){
        if (mode.equals("reset")){
            this.health = 100;
        }
    }

    public void display(){
        System.out.println(this.name + " Mempunyai " + this.health);
    }
}
