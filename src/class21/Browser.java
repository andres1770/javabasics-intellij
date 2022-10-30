package class21;

public class Browser {
    void openBrowser(){
        System.out.println("opening a browser");
    }
    void navigate(){
        System.out.println("opening the url");
    }
    void test(){
        System.out.println("testing the web page ");
    }
    void closebrowser(){
        System.out.println("close the browser");
    }

}
class Chrome extends Browser{
    @Override
    void openBrowser(){
        System.out.println("opening the browser in less than 1 second");
    }

}
class FireFox extends Browser{
    @Override
    void openBrowser(){
        System.out.println("opening the browser in less than 2 second");
    }
}
class browsertester{
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();
        chrome.closebrowser();
    }
}