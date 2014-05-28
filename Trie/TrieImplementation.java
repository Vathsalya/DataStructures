package com.search.trie;

import java.util.ArrayList;

public class TrieImplementation {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieImpl t = new TrieImpl();
	//	TrieNode1 t = new TrieNode1();
		t.insertWord("cat");
		t.insertWord("cow");
		t.insertWord("camel");
		t.insertWord("dog");
		
		System.out.println(t.searchWord("dog"));
	/*	ArrayList s = t.getWords();
		
		ArrayList ss = t.getWords("c");
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(i));
		
		for(int i=0;i<ss.size();i++)
			System.out.println(ss.get(i));
		*/
	}

}
