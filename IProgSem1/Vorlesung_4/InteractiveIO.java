import java.io.*;

class InteractiveIO {
	private BufferedReader br;

	public InteractiveIO() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void write(String s) {							//Ruft write and Flush auf
		this.writeAndFlush(s);
	}

	public String promptAndRead(String s) throws Exception {			//Gibt String wieder und erwartet Eingabe
		this.writeAndFlush(s);
		return br.readLine();
	}

	private void writeAndFlush(String s) {					//Gibt String aus und flusht
		System.out.println(s);
		System.out.flush();
	}
}