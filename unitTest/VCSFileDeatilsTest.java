package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import github.VersionControlSystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VCSFileDeatilsTest {
	
	VersionControlSystem vcsFileDeatils;
	final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	final PrintStream originalOut = System.out;
	@Before
	public void setUp() throws Exception {
		vcsFileDeatils = new VersionControlSystem();
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() throws Exception {
		vcsFileDeatils = null;
		System.setOut(originalOut);
	}

	@Test
	public void vcsFileDeatilsTestFileDetails() {

		int totalNumOfFiles = 7;
		Set<Integer> ignoredFiles = new HashSet<Integer>(); 
		Set<Integer> trackedFiles = new HashSet<Integer>();
		ignoredFiles.add(2);
		ignoredFiles.add(3);
		ignoredFiles.add(6);
		ignoredFiles.add(7);

		trackedFiles.add(1);
		trackedFiles.add(3);
		trackedFiles.add(6);
		
		vcsFileDeatils.VCSFileDetails(totalNumOfFiles, ignoredFiles, trackedFiles);
		//2 untracked & unignored and 2 tracked & ignored files in VCS
		String output = " 2,2";
		assertEquals(output,outContent.toString());
		
		trackedFiles.remove(3);
		vcsFileDeatils.VCSFileDetails(totalNumOfFiles, ignoredFiles, trackedFiles);
		output +=" 1,2"; 
		assertEquals(output,outContent.toString());
		
	}

}
