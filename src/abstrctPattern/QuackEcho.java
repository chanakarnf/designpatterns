package abstrctPattern;

public class QuackEcho implements Quackable {
    Quackable duck;
    public QuackEcho(Quackable duck) {
        this.duck=duck;
    }

    @Override
    public void quack() {
        duck.quack();
        echo();
    }
    public void echo(){
        System.out.print("Echo: ");
        duck.quack();
    }
}

