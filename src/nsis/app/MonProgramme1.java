package nsis.app;

import nsis.metier.MaThread;

public class MonProgramme1 {
	public static void main(String[] args) throws Exception {
		Thread maThread = new Thread(new MaThread("Titi",500));
		Thread maThread2 = new Thread(new MaThread("GrosMinet",500));
		
		maThread.start();
		maThread2.start();
		
		int i;
		for (i = 0; i < 5; i++) {
			System.err.println("La thread initiale " + i);
			Thread.sleep(300);
		}
		System.err.println("La thread initiale se termine");
		 
		
	 }
}