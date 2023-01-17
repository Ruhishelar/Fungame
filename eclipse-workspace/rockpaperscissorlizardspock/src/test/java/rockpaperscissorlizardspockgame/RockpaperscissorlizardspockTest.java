package rockpaperscissorlizardspockgame;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Test;

public class RockpaperscissorlizardspockTest {
	private static Scanner scanner = new Scanner(System.in);
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void Test1() {
		String playerselection;
		Rockpaperscissorlizardspock checkplayervscomputer= new Rockpaperscissorlizardspock();
	    checkplayervscomputer.playerselection();
	    playerselection= scanner.nextLine();
	    if(playerselection.equals("1"))
	    {
	    assertEquals(1, playerselection);
	    assertTrue(true);
	    }
		
	}

	

}
