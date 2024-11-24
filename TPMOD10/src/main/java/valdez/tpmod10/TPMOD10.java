/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package valdez.tpmod10;

/**
 *
 * @author valde
 */
public class TPMOD10 {

    public static void main(String[] args) {
        UserData user1 = new UserData(1234,8766);
        UserData user2 = new UserData(1111,8766);
        
        
        try{
            user1.login();
        } catch (LoginFailedException e){
            System.out.println(e.getMessage());
        }
        try{
            user2.login();
        } catch (LoginFailedException e){
            System.out.println(e.getMessage());
        }
        try{
            user2.login();
        } catch (LoginFailedException e){
            System.out.println(e.getMessage());
        }
    }
}
