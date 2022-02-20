package test;

import com.sun.java.swing.plaf.windows.WindowsButtonUI;

/**
 * @author cshstart
 * @create 2022-01-27-16:30
 */
public class WindowTest {
    static class Window extends Thread{
        private static int ticket = 100;

        public Window(){}
        public Window(String str) {
            super(str);
        }

        @Override
        public void run() {
//            public void test1(){
//                System.out.println(1);
//            }
            while(true) {
                if (ticket > 0) {
                    System.out.println(getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Window t1 = new Window("窗口一");
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
