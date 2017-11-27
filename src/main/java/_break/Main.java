package _break;


public class Main {
    public static void main(String[] args) {

        label:{
            System.out.println(1);
            if(Math.random()<0.5)
                break label;
            System.out.println(2);
        }


    }
}


