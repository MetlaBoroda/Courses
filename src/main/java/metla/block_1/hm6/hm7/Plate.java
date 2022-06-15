package metla.block_1.hm6.hm7;


public class Plate {
    private int food;


    public Plate(int food) {
        this.food = (food > Integer.MAX_VALUE) ? Integer.MAX_VALUE - 1 : food;


    }



    public boolean decreaceFood(int n) {
        if (food >= n) {
            food -= n;
            System.out.println("кот поел");
            return true;
        }
        System.out.println("покормите котика");
        return false;
    }

    public void addFood(int n) {
        if (n > 0) {
            food += n;
        } else
            System.out.println("ошибка,невозможно добавить отрицательное количество еды");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plate{");
        sb.append("food=").append(food);
        sb.append('}');
        return sb.toString();
    }
}


