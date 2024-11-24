package valdez.tpmod7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valde
 */
public class HomePage extends WebPage {
    public HomePage(String title){
        super(title);
    }
    @Override
    public void login(String input){
        loggedUsername = input;
        System.out.println("Selamat datang di halaman Home, "+loggedUsername+"!");
    }
    @Override
    protected void showMainPage(){
        if(loggedUsername == null){
            System.out.println("# Selamat datang                     ##");
            System.out.println("# Anda sedang berada di home page    ##");
            System.out.println("# Ini penjelasan umum home page      ##");
        } else {
            System.out.println("# Selamat datang, "+loggedUsername+"          ##");
            System.out.println("# Anda sedang berada di home page    ##");
            System.out.println("# Ini penjelasan khusus home page    ##");
            
        }
    }
    
}
