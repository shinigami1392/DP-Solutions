package practice.solutions.easy.leetcode;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		boolean flag = false;
		//StringBuffer ransomArray = new StringBuffer(ransomNote);
		StringBuffer magazineArray = new StringBuffer(magazine);
		int count = 0;
		for(int i = 0 ; i< ransomNote.length(); i++) {
			int lastIndex = magazineArray.lastIndexOf(new Character(ransomNote.charAt(i)).toString());
			if(lastIndex>=0){
				magazineArray.replace(lastIndex, lastIndex+1, "");
				count++;
			}
		}
		if (count == ransomNote.length()) {
			flag = true;
		}
		return flag;
	}
}
