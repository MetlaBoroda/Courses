package metla.hm7;

    public class Cat {
    private String name;
    private int appetite;
    public boolean satiety;

        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
        }


    public void eat(Plate p) {
        if (!satiety) {
            satiety = p.decreaceFood(appetite);
        }
    }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Cat{");
            sb.append("name='").append(name).append('\'');
            sb.append(", appetite=").append(appetite);
            sb.append(", satiety=").append(satiety);
            sb.append('}');
            return sb.toString();
        }
    }
