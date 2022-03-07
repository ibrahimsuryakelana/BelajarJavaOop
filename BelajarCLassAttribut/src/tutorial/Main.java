package tutorial;

class Display{
    public static String type = "DISPLAY";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String type){

        //Kalo Static dibagi kesemua atribut jadi kita direkomendasikan langsung memanggil classnya saja
        Display.type = type;
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display = new Display("monitor");
        display.show();
        System.out.println(Display.type);

        display.setType("tampilan");
        System.out.println(display.type);
    }
}
 