//How to create Interface in java Program
interface Info {
    static final String language = "Java";
    public void display();
}
class Simple implements Info{
    public static void main(String []args) { 
        Simple obj = new Simple(); 
        obj.display();
    }
    // Defining method declared in interface
    public void display() { 
        System.out.println(language + " is awesome");
}
}

