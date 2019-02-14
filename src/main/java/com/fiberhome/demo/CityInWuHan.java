package com.fiberhome.demo;

/**
 * @author vv
 * @since 2019/2/13
 */
public class CityInWuHan {
    public static void main(String[] args) {
        City wuhan=new City();
        City wuhanStudent=new City();
        wuhanStudent.getPopulation();
        wuhan.setPopulation(380000);
        wuhan.male=200000;
        wuhan.female=180000;
        wuhan.getArea();
        wuhan.setMalepercentage(65);
        wuhan.setFemalepercentage(35);
        wuhan.setLocation("middle of china");
        long wuhanstudentnumber=wuhan.studentnumber(3,6000);
        System.out.println(wuhan.getPopulation());
        System.out.println(wuhan.male);
        System.out.println(wuhanstudentnumber);
        System.out.println(wuhan.studentnumber(3,6000));

        City.a = 100;
        System.out.println(City.a);

        City.getNumber();
        System.out.println(City.getNumber());

        String c = "1000";
        int cInt = StringUtil.str2Int(c);
        System.out.println(cInt);
        System.out.println(StringUtil.str2Int(c));
        System.out.println(StringUtil.str2Int("1000"));

        StringUtil util = new StringUtil();
        System.out.println(">>>>"+util.str2Int2("10"));

        City w2=new City(100, 10000);
        System.out.println("---"+w2.getFemale());
    }
}
