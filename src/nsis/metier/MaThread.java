package nsis.metier;

public class MaThread implements Runnable {
	private int tmpSleep;
	private String nom;
	
	
	public MaThread(String nom, int tmpSleep) {
		this.tmpSleep = tmpSleep;
		this.nom = nom;
	}
	
 public void run() {
  int i;
  for (i = 0; i < 5; i++) {
   System.out.println("Ma thread n°"+nom+" n°Boucle= " + i);
   try {
    Thread.sleep(tmpSleep);
   } catch (java.lang.InterruptedException e) {
    System.out.println("Interrupted !");
   }
  }

  System.out.println("Ma thread se termine");

 }
}