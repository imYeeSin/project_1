package examples;

/**
 * SharePurchase.java An immutable class that represents the purchase of one
 share of stock.
 *
*/
public class SharePurchase {

  private double cost;

  public SharePurchase(double costPerShare) {
    cost = costPerShare;
  }

  public double getCostPerShare() {
    return cost;
  }
  //mmm
}
