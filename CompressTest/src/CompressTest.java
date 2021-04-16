
public class CompressTest {
	
	public static int numLines = 4;
	public static char[] fileChars = new char[2];

	
	public static void main(String[] args) {
	      String[] lines = new String[numLines];
	      lines[0] = "aaaaab";
	      lines[1] = "bbbbba";
	      lines[2] = "abbbba";
	      lines[3] = "bababa";
	      String[] finished = compressLines(lines);
	      System.out.println(finished);
	}
	
	public static String[] compressLines(String[] lines){
	     //TODO: Implement this method
	     //System.out.println("in method");
	     String[] workCompress = new String[numLines];
	      fileChars[0] = lines[0].charAt(0);
	      for(int i=0; i < numLines; i++){
	        for(int j=0; j < lines[i].length()-1; j++){
	           if(lines[i].charAt(j)!= fileChars[0]){
	              fileChars[1] = (lines[i].charAt(j));
	           }
	        }
	      }
	      //System.out.println("fileChars" + fileChars[0] + fileChars[1]);
	      for(int i=0; i < numLines; i++){ 
	    	  int order = 1; 
	    	  while(lines[i].indexOf(fileChars[order])!= -1){
	    		  int place = 0;
	    		  //System.out.println(i + " " + lines[i].indexOf(fileChars[order]));
	    		  if(workCompress[i] == null)
	    			  workCompress[i] = (Integer.toString(lines[i].indexOf(fileChars[order]) - place) + ","); 
	    		  else
	    			  workCompress[i] += (Integer.toString(lines[i].indexOf(fileChars[order]) - place) + ",");
	    		  //System.out.println("there " + workCompress[i]);
	    		  place = lines[i].indexOf(fileChars[order]);
	    		  lines[i] = lines[i].substring(place);
	    		  if(order == 1){
	    			  order = 0;
	    		  }
	    		  else {
	    			  order = 1;
	    		  }
	    	  }
	    	  workCompress[i] += lines[i].length();
	    	  System.out.println("here" + workCompress[i]);
	      }
	      return workCompress;
	  }
}
