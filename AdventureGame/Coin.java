public class Coin extends Item {
  private int value;

  public Coin(int value) {
    super("Coin ¢" + value, "coin");
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
