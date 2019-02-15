package com.fiberhome.demo;

/**
 * @author vv
 * @since 2019/2/13
 */
public class City {



    public static final String SEPERATOR = "#";
    public static int a = 100;

    private long population;

    public long male=9;

    {
        this.female = this.female+1;
        System.out.println(this.female);
    }

    public long female = 900L;

    private long area=50;

    private String location;

    private String province;



    public City(){

    }

    public City(long m, long a){
        this.male = m;
        this.area = a;
    }

    public City(long m, long a, String location){
        this.male = m;
        this.area = a;
        this.location = location;
    }

    public long getPopulation() {
        return population;
    }

    public long getArea() {
        return area;
    }

    public String getLocation() {
        return location;
    }

    public String getProvince() {
        return province;
    }

    public long getMale() {
        return male;
    }

    public long getFemale() {
        return female;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setMalepercentage(long male) {
        this.male = male;
    }

    public void setFemalepercentage(long femalepercentage) {
        this.female = femalepercentage;
    }

    public long studentnumber(long a,long b){
        return a*b;
    }


    public static String getNumber(){
        return a+SEPERATOR;
    }

}
