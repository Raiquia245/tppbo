/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package valdez.tpmod10;
import java.util.HashMap;
/**
 *
 * @author valde
 */
public class LoginFailedException extends Throwable{
    private static HashMap<Integer,Integer> failedcount = new HashMap<>();
    private int userid;
    /**
     * Constructs an instance of <code>LoginFailedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     * @param user
     */
    public LoginFailedException(String msg, int user) {
        super(msg);
        this.userid = user;
        failedcount.put(user, failedcount.getOrDefault(user, 1) + 1);
        
    }
    
    public int getUserid(){
        return userid;
    }

    public static int getFailedCounter(int user){
        return failedcount.getOrDefault(user, 1);
    }
}
