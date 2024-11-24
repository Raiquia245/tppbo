/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package valdez.tpmod7;

/**
 *
 * @author valde
 */
public class Tpmod7 {

    public static void main(String[] args) {
        HomePage homepage = new HomePage("REAPER SCANS");
        DashboardPage dashboard = new DashboardPage("REAPER SCANS");
        
        System.out.println("TAMPILAN HOMEPAGE SEBELUM LOGIN");
        homepage.showFullPage();
        System.out.println("");
        homepage.login("raiquiaID");
        System.out.println("");
        System.out.println("TAMPILAN HOMEPAGE SESUDAH LOGIN");
        System.out.println("");
        homepage.showFullPage();
        System.out.println("");
        System.out.println("TAMPILAN DASHBOARD SEBELUM LOGIN");
        dashboard.showFullPage();
        System.out.println("");
        dashboard.login("raiquiaID");
        System.out.println("");
        System.out.println("TAMPILAN DASHBOARD SESUDAH LOGIN");
        System.out.println("");
        dashboard.showFullPage();
        
        
    }
}
