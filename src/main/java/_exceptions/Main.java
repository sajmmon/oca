package _exceptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args){


/** NullPointerException */
        /*{
            Boolean b = null;
            if (b) {
                int i = 1;
            }
            ;
        }
        */

/** Hiding exception from catch with the one from finally */
        /*
        try{
            doit();
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("------------");
            System.out.println(e.getMessage());
            System.out.println("------------");
            System.out.println(e);
        }
        */
/** return statement in catch */
        if(false) {
            String s = null;
            System.out.println(dothat(s));
        }
        // In finally
        // In catch

        if(true) {
            String s = "Str";
            System.out.println(dothat(s));
        }
    }

    static String dothat(String s1){
        try{
            return s1.toString();
        }catch(NullPointerException e){
            return "In catch";
        }
            finally {
            System.out.println("In finally");
        }
    }

    static void doit() throws IOException{
        try{
            System.out.println("Hi hi");
            /** Can catch Exception that is not thrown */
        } catch (Exception e){
            throw new Exception("From catch");
        } finally {
            throw new IOException("From finally");
        }
    }

    void justCheck(){
        /** OK */
        try{
            System.out.println();
        }catch (RuntimeException e){

        }

        /** OK */
        try{
            System.out.println();
        }catch (Exception e){ // also Throwable, Error

        }

        /** NOT OK */
//        try{
//            System.out.println();
//        }catch (IOException e){
//
//        }
    }
}
