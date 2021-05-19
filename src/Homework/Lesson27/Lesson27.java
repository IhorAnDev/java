/*
package Homework.Lesson27;

public class Lesson27 {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finnaly block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

    class Tiger {
        public void eat(String eda) {
            if (!eda.equals("myaso")) {
                throw new NeMyasoException("Tigr ne est " + eda);
            }
            System.out.println("Tigr est myaso");
        }

        public void drink(String jidlost) {
            if (!jidlost.equals("voda")) {
                throw new NeVodaException("tigr ne pyet " + jidlost);
            }
            System.out.println("Tigr pyet vodu");
        }
    }

    class NeMyasoException extends RuntimeException {
        NeMyasoException(String s) {
            super(s);
        }
    }

    class NeVodaException extends Exception {
        NeVodaException(String s) {
            super(s);
        }
    }*/
