package basico;

public class Try_catch {
    public static void main(String[] args) {
        try{
            int result = 4 / 0;
            System.out.println(result);
        }catch (Exception e){
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
