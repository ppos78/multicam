package ThreadPractice;

import java.util.Map;
public class ThreadInfoExample {
public static void main(String[] args) {
	AutoSaveThread ast=new AutoSaveThread();
	ast.setDaemon(true);
	ast.setName("AutoSaveThread");
	ast.start();
	Map<Thread, StackTraceElement[]> map
	=Thread.getAllStackTraces();
	for(Thread t:map.keySet()) {
		System.out.println(t.getName());
		System.out.println(t.isDaemon()?"데몬":"주");
		System.out.println(t.getThreadGroup().getName());
		System.out.println();
	}
}
}
