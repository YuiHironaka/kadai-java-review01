
public class Review01 {

    public static void main(String[] args) {
       //〇円の△％の消費税混みの値段＝〇÷
        int price = 1500;//料金の変数
        double tax = 0.1;//消費税の変数
        
        int result1 = getinclusivePrice(price, tax);
        int result2 = get(price, tax);
        System.out.println(price+"円の商品の税込み価格は"+result1+"円"+"（消費税は"+result2+"円）です。"
               );
    }
               
        public static int getinclusivePrice(int price, double tax) {
            int result1 = (int) (price*(1+tax));
            return result1;
        }
        
        public static int get(int price, double tax) {
            int result2 = (int) (price*tax);
            return result2;

    }

}
