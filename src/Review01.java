
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;//料金の変数
        double tax = 0.1;//消費税の変数

        int result1 = getinclusivePrice(price, tax);
        int result2 = gettax(price, tax);
        System.out.println
        (price+"円の商品の税込み価格は"+result1+"円"+"（消費税は"+result2+"円）です。");
    }

        //税込み価格を計算
        public static int getinclusivePrice(int price, double tax) {
            int result1 = (int) (price*(1+tax));
            return result1;
        }

        //消費税がいくらかを計算
        public static int gettax(int price, double tax) {
            int result2 = (int) (price*tax);
            return result2;

    }

}
