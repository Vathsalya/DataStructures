package com.search.trie;

import java.util.ArrayList;

public class TrieImpl implements Trie{

	TrieNode root;
	public TrieImpl(){
		root = new TrieNode();
	}
	@Override
	public ArrayList getWords(String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertWord(String word) {
		// TODO Auto-generated method stub
		insertWord(root,word);
	}
	public void insertWord(TrieNode t,String word){
		char c = word.charAt(0);		
		TrieNode tri =t.getNode(c);
		if(tri == null){
			t.setNode(c);
		}
		if(word.length()>1){		
			insertWord(t.getNode(c),word.substring(1));
		}else
			t.isLastChar = true;
	}

	@Override
	public void deleteWord(String word) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteWords(char prefix) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean searchWord(String word) {
		// TODO Auto-generated method stub

		return searchWord(root,word);
	}
	public boolean searchWord(TrieNode t,String word){
		char c = word.charAt(0);
		if(t==null)
			return false;
		if(word.length()==1 && t.isLastChar && t!=null)
			return true;
		if(word.length()>1)
			return searchWord(t.getNode(c),word.substring(1));
		else
			return false;		
	}

	@Override
	public boolean hasNextChar(char prefix) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLastChar(char prefix) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
