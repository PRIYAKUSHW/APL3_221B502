
class Mother {
    int x;

    void show() {
        System.out.println("Show of Mother is called");
    }
}

class Child extends Mother {
    // Empty body
}

public class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
