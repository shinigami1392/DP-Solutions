package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		List<List<Integer>> wrapper = pt.generate(5);
		for(List<Integer> list : wrapper){
			for(int num : list){
				System.out.print(num+ " ");
			}
			System.out.println();
		}
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> wrapper = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		wrapper.add(list);
		for(int i = 1; i < numRows; i++){
			List<Integer> newList = new ArrayList<>();
			newList.add(1);
			for(int j=1; j <= i; j++){
				if(j+1 >= list.size() || j == 0){
					if(j+1==list.size()){
						newList.add(list.get(j)+list.get(j-1));
					}else{
					newList.add(1);}
				}else{
					newList.add(list.get(j-1) +list.get(j));
				}
			}
			wrapper.add(newList);
			list = newList;
		}
		return wrapper;
	}
}
