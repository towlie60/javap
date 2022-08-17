package oopclasses.interfaces;

//implements not extends
public class Chrome implements BrowserService {


    @Override
    public void navigate(String url) {
        //find chrome
        //call its main method
        //call goToUrl method
        //open the page.
    }

    @Override
    public void playVideo() {
        //Check player
        //if flashInstalled
        //then play the video

    }

    @Override
    public void click() {
    //click the button link
    }

    @Override
     public String getUrl(){
        return "SafariURL";
    }
}
