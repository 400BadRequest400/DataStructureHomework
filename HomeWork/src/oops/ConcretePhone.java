package oops;

public class ConcretePhone extends AbstractPhone implements InterfacePhone {
    @Override
    public void call() {
        System.out.println("call functionality from interface_phone class");
    }

    @Override
    public void text() {
        System.out.println("text functionality from interface_phone class");
    }

    @Override
    public void charge() {
        System.out.println("charge functionality from interface_phone class");
    }

    @Override
    public void videocall() {
        System.out.println("video call functionality from abstract_phone class ");
    }
}
