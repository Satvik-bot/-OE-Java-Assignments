class Mammals {
    public static void f1() {
        System.out.println("I am mammal");
    }
}

class MarineAnimals extends Mammals {
    public static void f2() {
        System.out.println("I am a marine animal");
    }
}

class BlueWhale extends Mammals implements MarineAnimals {
    public static void f3() {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
}

    public static void main(String[] args) {

    }