package comm;

public class MathOperation {
	
	private int no,i;
	private StringBuilder tableString;
		
	public MathOperation() {
		// TODO Auto-generated constructor stub
		no = 5;
	}
	
	public MathOperation(int no) {
		this.no = no;
		tableString = new StringBuilder("");
		}

	public String table() 
	{
		
		for(i = 1;i<=10;i++) {
			
		tableString.append("<br>"+(i*no));
		}
		tableString.append("</h2>");
		return tableString.toString();
		
		}
	}
