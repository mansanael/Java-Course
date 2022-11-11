package tp;
public interface APIInterface {
    void didCancel();

    void didFailed(String reason);

    String didReceiveResult();

   public void main(){
       callAPI(this);
   }

   private static void callAPI(APIInterface apiInterface){
       apiInterface.didReceiveResult();
   }
}
