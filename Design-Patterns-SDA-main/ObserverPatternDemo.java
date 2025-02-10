package Subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexa = new HexaObserver(subject);
        OctalObserver octal = new OctalObserver(subject);
        BinaryObserver binary = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        subject.detach(hexa);
        System.out.println("State change: 5 after detaching OctalObserver");
        subject.setState(5);  
        
        
        octal.isActive = false;
    }
}
