import org.testng.annotations.Test;

public class Footballpeople extends People {
    public String team;

    public  void football(){

        System.out.println("football");

        People p = new People();

        //p.number=11;
        p.name="xiaa";
        p.age=100;
        p.speak(p.name,p.age);


    }


}
