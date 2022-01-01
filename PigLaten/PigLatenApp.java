/*
PigLatinApp
C King
9 4 2020
*/

import javax.swing.*;
public class PigLatinApp{
	public static void main(String argd[]){

		String word.newWord;

		PigLatin MyPigLatin=new PigLatin();

		word=JOptionPane.showInputDialougue(null,"Entre your name");
		myPigLatin.setWord(word);

		myPigLatin.compute();

		newWord=myPigLatin.getNewWord();
		JOptionpane.showMessageDialouge(null, "that name translates to the piglatin name" +newWord);

	}
}
