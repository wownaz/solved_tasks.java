import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        ArrayList<CapitalCities> appList = new ArrayList<CapitalCities>();
        appList.add(new CapitalCities("Kazakhstan","Nur-Sultan"));
        appList.add(new CapitalCities("Russia","Moskow"));
        appList.add(new CapitalCities("Ukrain","Kiev"));
        appList.add(new CapitalCities("USA","Washington"));
        appList.add(new CapitalCities("China","Beijing"));
        appList.add(new CapitalCities("Japan","Tokyo"));
        appList.add(new CapitalCities("Australia","Canberra"));
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        boolean found = false;
        for(CapitalCities cc:appList){
            if(cc.getCountry().equals(country)){
                found = true;
                System.out.println("The capital of "+country+" is "+cc.getCapital());
                break;
            }
        }
        if(!found)
            System.out.println("The capital was not found");
    }
}
 class CapitalCities<K,V> {
    public K country;
    public V capital;
    public CapitalCities(K country,V capital){
        this.country = country;
        this.capital = capital;
    }
    public V getCapital(){
        return this.capital;
    }
    public K getCountry(){
        return this.country;
    }
    public void setCapital(V capital){
        this.capital = capital;
    }
}
