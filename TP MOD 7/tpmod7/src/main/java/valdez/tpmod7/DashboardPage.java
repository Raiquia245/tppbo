package valdez.tpmod7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valde
 */
public class DashboardPage extends WebPage {
    public DashboardPage(String title){
        super(title);
    }
    @Override
    public void login(String input){
        loggedUsername = input;
        System.out.println(loggedUsername+" berhasil login ke halaman dashboard");
    }
    @Override
    protected void showMainPage(){
        if(loggedUsername == null){
            System.out.println("# Akses ditutup untuk user guest     ##");
            System.out.println("# Mohon login terlebih dahulu        ##");
        } else {
            System.out.println("# Dashboard Page - "+loggedUsername+"         ##");
            System.out.println("# Opsi-opsi page dashboard           ##");
            System.out.println("# dsb                                ##");
            
        }
    }
}

