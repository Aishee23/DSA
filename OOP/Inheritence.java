public class Inherit {
    double l;
    double h;
    double w;
    Inherit () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Inherit (double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Inherit(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Inherit(Inherit old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public static void main(String[] args) {
        Inherit box1 = new  Inherit(2);
        
        Inherit box2 = new  Inherit(box1); 
    
        
        System.out.println(box2.w + " " + box2.h);
}
}


