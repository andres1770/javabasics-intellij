package class25;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
        //boxing or manual conversion from primitive to wrapper type

      //  Integer wrappednum=Integer.valueOf(num);

        //autboxing or automatic conversion from primitive to a wrapper type
        Integer wrappednum=num;
        System.out.println(wrappednum);

        //unboxing converting a wrapped type to a corresponding primitive type
       // int num2=wrappednum.intValue();

        //autounboxing or automatric conversion of a wrapper type t a primtive type
        int num2=wrappednum;

    }
}
