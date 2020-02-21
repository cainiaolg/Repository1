import java.util.Scanner;

public class Digits2Letters {
    public static void main(String[] args) {
        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please input data(0-99),If the data entered is 10, the program exits!");
            String res = digits2Letters(sc.nextInt());
            if (res.contains("exit")){
                break;
            } else {
                System.out.println(res);
            }
        }
    }
    public static String digits2Letters(int num){
        String[] str = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        String resultStr = "";
        int high = 0;
        int low = 0;
        char hch[];
        char lch[];
        if (num >= 0 && num <= 99) {
            char[] chars = Integer.toString(num).toCharArray();
            //System.out.println("Input: arr[] = {"+chars[0]+","+chars[1]+"}");
            if (num == 10){
                resultStr += "exit";
            } else {
                high = num / 10 == 0 ? (num % 10) : (num / 10);
                low = num / 10 == 0 ? 0 : (num % 10);
                hch = str[high].toCharArray();
                lch = str[low].toCharArray();
                StringBuilder sb = new StringBuilder("Output: ");
                for (int i = 0; i < hch.length; i++) {
                    if (lch.length > 0){
                        for (int j = 0; j < lch.length; j++) {
                            sb.append(hch[i]);
                            sb.append(lch[j]);
                            sb.append(" ");
                        }
                    }else {
                        sb.append(hch[i]);
                        sb.append(" ");
                    }
                }
                resultStr += sb.toString();
            }
        } else {
            resultStr +="The data you entered is wrong, please re-enter!";
        }
        return resultStr;
    }
}
