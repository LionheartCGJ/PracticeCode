package test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
/**
 * 自动输入工具类
 * @author Wayss
 *
 */

public class InputTool {

    //Shift组合键
    public static void keyPressWithShift(Robot r,int key){
        //按下Shift
        r.keyPress(KeyEvent.VK_SHIFT);
        //按下某个键
        r.keyPress(key);

        //释放某个键
        r.keyRelease(key);
        //释放Shift
        r.keyRelease(KeyEvent.VK_SHIFT);
        //等待100ms
        r.delay(100);
    }

    //Ctrl组合键
    public static void keyPressWithCtrl(Robot r,int key){
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(key);

        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_CONTROL);

        r.delay(100);
    }

    //Alt组合键
    public static void keyPressWithAlt(Robot r ,int key){
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(key);

        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_ALT);
        r.delay(100);
    }

    //输入字符串
    public static void keyPressString(Robot r ,String str){
        //获取剪切板
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        //将传入字符串封装下
        Transferable tText = new StringSelection(str);
        //将字符串放入剪切板
        clip.setContents(tText, null);
        //按下Ctrl+V实现粘贴文本
        keyPressWithCtrl(r, KeyEvent.VK_V);
        r.delay(50);
    }

    //输入数字
    public static void keyPressNumber(Robot r ,int number){
        //将数字转成字符串
        String str = Integer.toString(number);
        //调用字符串的方法
        keyPressString(r,str);
    }

    //实现按一次某个按键
    public static void keyPress(Robot r,int key){
        //按下键
        r.keyPress(key);
        //释放键
        r.keyRelease(key);

        r.delay(50);
    }

    //快速打开QQ消息(这个组合键因人而异)
    public static void keyPressAtlWithCtrlWithZ(Robot r){
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_Z);

        r.keyRelease(KeyEvent.VK_Z);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_ALT);
    }

    //点击一下鼠标左键
    public static void mouseLeftHit(Robot r){
        r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        r.delay(1000);
    }
}