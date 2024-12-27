package StepsSelenIDE.Task7;

import ElementsForSelenIDE.Task7.DynamicContentSelenIDEElements;
import URL.URL;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class DynamicContentSelenIDESteps extends DynamicContentSelenIDEElements {

    public DynamicContentSelenIDESteps openURL () {
        URL url = new URL();
        open(url.dynamicContent);
        return this;
    }

    public DynamicContentSelenIDESteps dynamicContent () {
        dynamicContent.click();
        return this;
    }

    List<List<String>> pictureSrcList = new ArrayList<>();
    List<List<String>> textList = new ArrayList<>();

    public DynamicContentSelenIDESteps getPictureList () {

        List<String> imgList = new ArrayList<>();
        imgList.add(firstPicture.getAttribute("src"));
        imgList.add(secondPicture.getAttribute("src"));
        imgList.add(thirdPicture.getAttribute("src"));
        pictureSrcList.add(imgList);

        List<String> txtList = new ArrayList<>();
        txtList.add(firstText.getText());
        txtList.add(secondText.getText());
        txtList.add(thirdText.getText());
        textList.add(txtList);

        return this;
    }

   public DynamicContentSelenIDESteps refreshData () {
        clickForRefresh.click();
        return this;
   }

   public void comparePicture (){

        if(pictureSrcList.size()==1) return;
        if(textList.size()==1) return;

        List<String> lastPictureArray = pictureSrcList.getLast();
        List<String> arrayPictureBeforeLast = pictureSrcList.get(pictureSrcList.size()-2);

       List<String> lastTextArray = textList.getLast();
       List<String> arrayTextBeforeLast = textList.get(textList.size()-2);

       /** სამივე ასერტის გაშვების შემთხვევაში ყოველთვის დაფეილდება. რომ არ დაფეილდეს საჭიროა მხოლოდ მესამე ასერტის დატოვება
        * რადგან მხოლო მესამე სურათი და ტექსტი ახლდება **/

       Assert.assertNotEquals(lastPictureArray.getFirst(),arrayPictureBeforeLast.getFirst());
       Assert.assertNotEquals(lastPictureArray.get(1),arrayPictureBeforeLast.get(1));
       Assert.assertNotEquals(lastPictureArray.getLast(),arrayPictureBeforeLast.getLast());

       Assert.assertNotEquals(lastTextArray.getFirst(),arrayTextBeforeLast.getFirst());
       Assert.assertNotEquals(lastTextArray.get(1),arrayTextBeforeLast.get(1));
       Assert.assertNotEquals(lastTextArray.getLast(),arrayTextBeforeLast.getLast());
   }

}




