package Lesson23;

public class Test6 {

}

class Animal {
     String showName() {
        return "Some animal";
    }

     void showIfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {
     String showName() {
        return "Jerry";
    }
    void showIfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showIfoAboutAnimal();
        a.showIfoAboutMouse();
    }
}