public class Main{
	public interface Inter {
	    public int adding(int start, int end);
	}
//creates lmabda
    public static void main(String[] args){
		Inter interfaceAdding = (start, end) ->{
			int r = 0;
				for(int i = start; i <= end; i++)
			    	r += i;
        	return r;
		};
		try {
			System.out.println(Inter.adding(args[0], args[1]));
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
