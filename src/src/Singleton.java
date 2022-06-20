package src.src;

import sun.security.util.Debug;

public class Singleton {


        private static Singleton obj = new Singleton();
        public String string;

    private Singleton()
        {
            string = "Welcome";
        }

        public static Singleton getInstance()
        {
            return obj;
        }
        public static void main(String[] args)
        {
            Singleton text = Singleton.getInstance();

            System.out.println("Original String:");
            System.out.println(text.string);

            System.out.println("String in Upper Case:");
            text.string = (text.string).toUpperCase();
            System.out.println(text.string);
        }
    }

