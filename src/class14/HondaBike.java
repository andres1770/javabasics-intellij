package class14;

import javax.imageio.stream.ImageInputStream;

public class HondaBike {

    static int topSpeed=200;
    static int NoOfTyres=2;
    String model;
    int year;

    void printTotalDistance(int noOfGallons, int avg){
        double distance=noOfGallons/10;
        System.out.println("you bike can go max "+distance+" with tis much "+noOfGallons);

    }

    public static void main(String[] args) {
        System.out.println(HondaBike.NoOfTyres);
        HondaBike ybr=new HondaBike();
        ybr.model="ybr1000";
        ybr.printTotalDistance(10,2);
    }
}
