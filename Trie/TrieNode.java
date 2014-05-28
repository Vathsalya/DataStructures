package com.search.trie;

public class TrieNode {

	final static int MAX_SIZE = 26;
	TrieNode[] tNode;
	boolean isLastChar;

	public TrieNode(){
		tNode = new TrieNode[MAX_SIZE];
		isLastChar = false;
	}

	public TrieNode getNode(char c){
		return tNode[c - 'a'];
	}
	public void setNode(char c) {
		tNode[c-'a'] = new TrieNode();
		//return tNode[c-'a'];
	}
	public boolean isCharEOW(){
		return isLastChar;
	}

}
