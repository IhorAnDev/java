package Lesson27;

public class Test15 {
    void marathon(int temperaturaVozduxa, int tembBega) throws PodvernutNoguException {
        if (tembBega > 12) {
            throw new PodvernutNoguException("Temp bega zashkalivaet " + tembBega);
        }
        if (temperaturaVozduxa > 30) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi probehali marathon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marathon(20, 13);
        }catch (PodvernutNoguException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("V lubom sluchae vi poluchite gramotu");
        }

    }
}


class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {

    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {
    }

    ;
}