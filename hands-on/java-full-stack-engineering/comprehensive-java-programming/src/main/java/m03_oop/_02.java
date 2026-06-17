package m03_oop;

abstract class DiscountPlan {
    int quantity;

    public DiscountPlan(int quantity) {
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        return this.quantity - discount();
    }

    abstract int discount();
}

class GoldDiscountPlan extends DiscountPlan {
    public GoldDiscountPlan(int quantity) {
        super(quantity);
    }

    @Override
    int discount() {
        return 90;
    }
}

class SilverDiscountPlan extends DiscountPlan {
    public SilverDiscountPlan(int quantity) {
        super(quantity);
    }

    @Override
    int discount() {
        return 100;
    }
}

class DiscountPlanFactory {
    public static DiscountPlan getBilling(int quantity) {
        if (quantity >= 100) {
            return new GoldDiscountPlan(quantity);
        } else {
            return new SilverDiscountPlan(quantity);
        }
    }
}

public class _02 {
    public static void main(String[] args) {
        int quantity = 100;
        DiscountPlan billing = DiscountPlanFactory.getBilling(quantity);
    }
}
