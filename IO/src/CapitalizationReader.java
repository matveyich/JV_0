import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;


public class CapitalizationReader extends BufferedReader{

	public CapitalizationReader(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String str = super.readLine();
		if (str != null){
			return str.toUpperCase();
		}
		return null;
	}

}
