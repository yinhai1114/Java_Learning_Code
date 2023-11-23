import javax.swing.*;
import java.awt.*;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class TEST {
    public static void main(String[ ] args) throws InterruptedException {
        int count=0;
        for (float y= 2.5f;y > -2.0f;y -= 0.12f){
            for (float x =-2.3f ; x < 2.3f;x += 0.041f){
                float a = x*x+y*y-2f;
                if ((a*a*a-x*x*y*y*y)<-0.0f){
                    String str="**";
                    int num =count % str.length();
                    System.err.print(str.charAt(num));
                    count++;
                }else{
                    System.err.print(" ");
                }
            }
            System.err.println();
            // Thread.sleep(100);
        }
    }
}
