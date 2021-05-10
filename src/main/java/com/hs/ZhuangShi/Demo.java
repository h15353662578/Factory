package com.hs.ZhuangShi;

/**
 * @author Huasheng
 * @Date 2021/05/10/17:02
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "姓名,工资\n 华生,10000\n 花生,12000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("C://Users//Huasheng//Desktop//OutPut.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("C://Users//Huasheng//Desktop//OutPut.txt");

        System.out.println("-----输入");
        System.out.println(salaryRecords);
        System.out.println("-----加密");
        System.out.println(plain.readData());
        System.out.println("-----解密");
        System.out.println(encoded.readData());
    }
}
