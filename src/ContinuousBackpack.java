import java.util.*;

public class ContinuousBackpack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int weightBackpack = in.nextInt();
        List<Items> setOfItems = new ArrayList<Items>(n);
        double count = 0;

        for (int i = 0; i < n; i++) {
            int price = in.nextInt();
            int weight = in.nextInt();
            double priceForOnePart =(double) price/weight;
            Items items = new Items(price, weight, priceForOnePart);
            setOfItems.add(items);
        }

        Collections.sort(setOfItems, Comparator.comparing(Items::getPriceForOnePart));

        for (int i = n; i >=0 ; i--) {
            if(count > weightBackpack){
                count = count - (count - weightBackpack);
            }
            if(count < weightBackpack){


            }


        }
    }

}
 class Items{
    private int price;
    private int weight;
    private double priceForOnePart;
    private double numberOfPartsItem;

    public Items(int price, int weight, double priceForOnePart){
        this.price = price;
        this.weight = weight;
        this.priceForOnePart = priceForOnePart;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public int getPrice(){
        return price;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setPriceForOnePart(double priceForOnePart){
        this.priceForOnePart = priceForOnePart;
    }

    public double getPriceForOnePart(){
        return priceForOnePart;
    }

    public void setNumberOfPartsItem(int weight, double priceForOnePart){
        this.numberOfPartsItem = weight/priceForOnePart;
    }

     public double getNumberOfPartsItem() {
         return numberOfPartsItem;
     }
 }
