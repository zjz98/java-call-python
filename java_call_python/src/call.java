import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class call {

    public static void main(String[] args) {
        try {
            String[] args1=new String[]{"python", "src/called.py"};
            Process pr=Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            int res = pr.waitFor();
            System.out.println(res);


        }catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}