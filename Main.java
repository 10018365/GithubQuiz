public class Main{
	public interface Inter {
	    public int adding(int start, int end);
	}

    public static void main(String[] args){
		Inter interfaceAdding = (start, end) ->{
			int r = 0;
				for(int i = start; i <= end; i++)
			    	r += i;
        	return r;
		};
    }
}
