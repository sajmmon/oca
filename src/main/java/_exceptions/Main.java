package _exceptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

        try{
            doit();
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("------------");
            System.out.println(e.getMessage());
            System.out.println("------------");
            System.out.println(e);
        }

    }

    static void doit() throws IOException{
        try{
            throw new Exception();
        } catch (Exception e){
            throw new Exception("From catch");
        } finally {
            throw new IOException("From finally");
        }
    }
}
