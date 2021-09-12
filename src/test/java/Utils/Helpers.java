package Utils;

public class Helpers {

    public String Title(){
        String title= Driver.get().getTitle();
        return title;
    }

    public String CurrentUrl(){
        String url=Driver.get().getCurrentUrl();
        return url;
    }

    public void get(String url){
        Driver.get().get(url);
    }
}
