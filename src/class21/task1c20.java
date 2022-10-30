package class21;

public class task1c20 {
    /* Write program: userClass that has a constructor that initializes instance variable
       name and mobile number. Create a subclass userInfo that will have user address variable
       and it also being initialized through constructor call.
       Print users name, mobile number and address in userDetails method. Test your code.
     */
    public static void main(String[] args) {
        userInfo userinfo=new userInfo("andres","9083569602","45 fairview");
                userinfo.printdetails();
    }
}
class userClass{
    String name;
    String mobileNo;

    userClass(String name,String mobileNo){
        this.name=name;
        this.mobileNo=mobileNo;
    }
}

class userInfo extends userClass{
    String address;

    userInfo(String name, String mobileNo,String address) {
        super(name, mobileNo);
        this.address=address;
    }
    void printdetails(){
        System.out.println("name "+name+" phone number "+mobileNo+" Address "+address);
    }
}