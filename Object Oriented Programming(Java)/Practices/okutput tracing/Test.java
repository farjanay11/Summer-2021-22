class Test{
	public static void main(String args[])
	{
		char[] array = new char[]{'A','R','R','R','Y','I','N','A','V','A'};
		char[] newarray = new char[10];
		
		for(int i=0;i<array.length;i++){
			if(array[i] =='A' && array[i]=='E' && array[i]=='I' && 
			array[i]=='O'&& array[i]=='U'){
				newarray[i]=array[i];
				array[i]='#';
			}
			else{newarray[i]='*';}
		}
		
		for(char c: array){System.out.print(c);}
		
		System.out.println();
		for(char c: newarray){System.out.print(c);}
	}
}