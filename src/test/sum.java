package test;

import static java.lang.Thread.sleep;

/**
 * @author cshstart
 * @create 2022-01-18-17:19
 *
 */




public class sum {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//        sleep(10000);
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(Thread.currentThread().getName()+":"+2);
//            sleep(1000);
//        }
        class myThread extends Thread{
            public myThread(String str) {
                super(str);
            }

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+1);
//                    try {
//                        sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        }
        class myThread2 extends Thread{
            public myThread2(String str) {
                super(str);
            }
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+2);
                }
            }
        }


        myThread t1 = new myThread("线程一");
        t1.setPriority(Thread.MIN_PRIORITY);
        myThread2 t2 = new myThread2("线程二");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t1.start();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(Thread.currentThread().getName()+":"+2);
//            sleep(1000);
//        }
    }
}

