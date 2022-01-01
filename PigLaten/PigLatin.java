/*
PigLatin
C King
9 4 2020
*/

//aplication that accets a name in
//move the first letter to the end
//add "ay" to the end of the word i.e lisa translante to isalay

public class PigLatin{

	private String world;//input
	private StringBuffer strBuff;//hold the word to be alerted
	private String newWord;//output

	public PigLating(){
		words="";
		newWord="";
		strBuff=new StringBuffer();
	}

	public void setWord(String word){
		this.word=word
	}

	//compute
	public void compute(){

		//loop to start at the second character
		for(int i=1; i word.lenght(); i++){

		//add those letters into the stringbuffer "isa"
		//accessing a individual character from the word inside the loop and adds it to my StringBuffer called strBuff
			strBuff.append(word.charAT(i));
		}//close loop

		// go to the first character and then add it into the stringbuffer "isal"
		strBuff.append(word.charAt(0));

		//add "ay" to the end of the word "isaly"
		strBuffer,append("ay");

		//convert to a string
		newWord=strBuff.toString();

}

	public String getNewWord(){
		return newWord;
	}

}