package basico.utilidades;

public class _TryCatch {
    public static void main(String[] args) {
        try{
            int result = (4/0) * 10;
            System.out.println(result);
        }catch (Exception e){
            // TODO: handle exception
            System.out.println("Error: "+e.getMessage());
        }
    }
}
