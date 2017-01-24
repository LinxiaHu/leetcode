package leetcode;

/**
 * Created by nicolas on 2017/1/24.
 */
public class Runner {
    public static void main(String[] args) {
        // 二进制相加,返回二进制
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("100", "11");
        System.out.println(result);
    }
}
