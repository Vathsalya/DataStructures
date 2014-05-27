package com.search.trie;

public interface Trie {
	/*
	 * 26 for lower/upper case
	 * 52 for both lower and upper case
	 */
	int MAX_SIZE = 26; //26 characters
	/*
	 * Get all the words starting with the prefix
	 */
	String[] getWords(char prefix);
	/*
	 * Insert word in to trie
	 */
	void insertWord(String word);
	/*
	 * Delete word from trie
	 */
	void deleteWord(String word);
	/*
	 * Delete all the word starting with the given prefix
	 */
	void deleteWords(char prefix);
	/*
	 * Search whether a word is present in the trie or not
	 */
	boolean searchWord(String word);
	/*
	 * Check is there is a next character
	 */
	boolean hasNextChar(char prefix);
	/*
	 * Check if the character is last or not.
	 */
	boolean isLastChar(char prefix);
	
}
