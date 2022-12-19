class Main {
    public static void main(String args[]) {
        Outer.StaticInner staticInnerObj = new Outer.StaticInner();
        System.out.println(staticInnerObj.msg);

        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();

        System.out.println(outerObj.msg);
        innerObj.displayPrivate();
        System.out.println(innerObj.msg);
    }
}

class Outer {
    String msg = "Outer class message";

    class Inner {
        String msg = "Inner class message";
        PrivateInner pinner = new PrivateInner();

        public void displayPrivate() {
            System.out.println("The secret message of private inner class is " + pinner.secret);
        }
    }

    static class StaticInner {
        String msg = "Static Inner class message";
    }

    private class PrivateInner {
        String secret = "password";
    }
}
