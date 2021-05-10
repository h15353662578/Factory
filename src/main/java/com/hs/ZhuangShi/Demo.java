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

        System.out.println("-----Input");
        System.out.println(salaryRecords);
        System.out.println("-----Encoded");
        System.out.println(plain.readData());
        System.out.println("-----Decoded");
        System.out.println(encoded.readData());
    }
}
