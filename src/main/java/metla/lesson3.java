package metla;

    public class lesson3 {
        public static void main(String[] args){

            print();

        }

        public static void print() {
            for (int i = 1; i < 11; ++i){
                System.out.printf("");
                for (int j = 1; j < 11; j++){
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
}