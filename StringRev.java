public class StringRev {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1=str+str.charAt(i);
		}
		System.out.println(str1);
		s.close();
}
}
