public class SingletonTest {

    public static void main(String[] args) {


        Logger l1 = Logger.getInstance();

        Logger l2 = Logger.getInstance();


        l1.log("Application Started");


        if(l1 == l2){

            System.out.println("Same Instance");

        }

        else{

            System.out.println("Different Instance");

        }

    }

}