
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;//料金の変数
        int taxresult = tax(price);
        int total = price + taxresult;
        System.out.println
        (price+"円の商品の税込み価格は"+total+"円"+"（消費税は"+taxresult+"円）です。");
    }

        //税込み価格を計算
    public static int tax(int price) {
        double taxnum1 = 0.1;//消費税の変数
        int result = (int) (price*taxnum1);
        return result;
    }


}
