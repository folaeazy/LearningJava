package abstracts;

public class Main {

    public static void main(String[] args){
        Brand car = new Brand();
        car.electric();
        car.startEngine();

        StringBuffer name = new StringBuffer("raymond");
        System.out.println(name.indexOf("a"));

    }

}
