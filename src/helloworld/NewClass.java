package helloworld;

/**
 *
 * @author WASD
 */
public class NewClass {

    private int x;
    private String name;

    public NewClass(int x) {
        this(x,"None");
    }

    public NewClass(int x, String name){
        this.x = x;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public String getName(){
        return name;
    }

}
