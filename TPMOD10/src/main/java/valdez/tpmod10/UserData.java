/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod10;

/**
 *
 * @author valde
 */
public class UserData {
    private int userid;
    private int password;
    private boolean isLoggedIn;
    
    public UserData(int userid, int password){
        this.userid = userid;
        this.password = password;
    }
    
    public void login() throws LoginFailedException{
        assert Integer.toString(userid).length() == 4 && Integer.toString(password).length() == 4;
        if (password+userid == 10000){
            isLoggedIn = true;
            System.out.println("Login succesful for user "+userid);
        } else {
            isLoggedIn = false;
            throw new LoginFailedException("Login user " + userid + " gagal, telah gagal login " + (LoginFailedException.getFailedCounter(userid)) + " kali.", userid);
        }
    }
}
