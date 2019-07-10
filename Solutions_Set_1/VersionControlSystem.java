package github;

import java.util.HashSet;
import java.util.Set;

public class VersionControlSystem {

	public void VCSFileDetails(int numberOfFilesinVCS,
			Set<Integer> ignoredFiles, Set<Integer> trackedFiles) {

		Set<Integer> unIgnoredAndUnTrackedFiles = new HashSet<Integer>();
		Set<Integer> ignoredAndTrackedFiles = new HashSet<Integer>();

		for (int i = 1; i <= numberOfFilesinVCS; i++) {
			if (ignoredFiles.contains(i) && trackedFiles.contains(i)) {
				// add to both ignored and tracked files list
				ignoredAndTrackedFiles.add(i);
			}
			if (!ignoredFiles.contains(i) && !trackedFiles.contains(i)) {
				// add to both un-ignored and untracked files list
				unIgnoredAndUnTrackedFiles.add(i);
			}
		}

		System.out.print(" " +ignoredAndTrackedFiles.size() + ","
				+ unIgnoredAndUnTrackedFiles.size());
	}
}
