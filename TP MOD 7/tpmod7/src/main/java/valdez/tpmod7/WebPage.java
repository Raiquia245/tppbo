package valdez.tpmod7;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valde
 */
public abstract class WebPage implements Loginable {
    private String webTitle;
    protected String loggedUsername;
    
    public WebPage(String title){
        webTitle = title;
    }
    protected void showHeader(){
        System.out.println("#######################################");
        System.out.println("###          "+webTitle+"            ##" );
        System.out.println("#------------------------------------##");
    }
    protected void showFooter(){
        System.out.println("#------------------------------------##");
        System.out.println("# Created by Valdez Bentiraz         ##");
        System.out.println("#######################################");
    }
    
    protected abstract void showMainPage();
    
    public void showFullPage(){
        showHeader();
        showMainPage();
        showFooter();
    }
        
    
    
}
