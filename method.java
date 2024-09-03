class method {

    public void playMusic() { // Method
        System.out.println("Music is playing");
    }

    public String getmePen(int cost) {
        if (cost >= 10) {
            return "Pen";
        } else {
            return "Nothing";
        }
    }

    public class Demo {
        public static void main(String[] args) {

            method obj = new method();

            String str = obj.getmePen(11);
            obj.playMusic();
            System.out.println(str);

        }
    }
}
