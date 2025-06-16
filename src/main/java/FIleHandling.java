import java.io.*;

public class FIleHandling {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("src/main/resources/test.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
