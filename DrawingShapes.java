public class DrawingShapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle t = new Turtle();
        t.home();
        t.speed(0);
        int n = 5;
        for (int i = 0; i < 5; i++) {
         t.forward(50);
         t.right(360/n);
        }

        // Task 2: Draw a regular shape many times
        t.up();
         t.setPosition(100, 100);
         t.down();
         
         for (int j = 0; j < 360/20; j++) {
            for (int i = 0; i < 5; i++) {
               t.forward(50);
               t.right(360/n);
            }
            t.right(20);
         }
        // Task 3: How many times does Turtle turn!

         t.up();
         t.setPosition(-100, -100);
         t.down();
         int turn = 0;
         for (int j = 0; j < 360/20; j++) {
            for (int i = 0; i < 5; i++) {
               t.forward(50);
               t.right(360/n);
               turn++;
            }
            t.right(20);
            turn++;
         }
         System.out.println("bertle has turned " + turn+ " times!");
        // Extension 1:

         t.speed(5);
         t.up();
         t.setPosition(-100, 100);
         t.down();
         int n1 = (int)(Math.random() * 10 + 3);
         int turndeg = 360 / (((int)(Math.random() * 4 + 1)) * 10);
         System.out.println(n1);
         System.out.println(turndeg);
         for (int j = 0; j < 360/turndeg; j++) {
            for (int i = 0; i < n1; i++) {
               t.forward(50);
               t.right(360/n1);
            }
            t.right(turndeg);
         }

        // Extension 2: triple nested loop
         t.up();
         t.setPosition(100, -100);
         t.down();
         for (int j = 0; j < 360/20; j++) {
            for (int i = 0; i < 5; i++) {
               t.right(15);
               for (int z = 0; z < 20; z++) {
                  if (z % 2 == 0) t.left(30);
                  else t.right(30);
                  t.forward(3);
               }
               t.left(15);
               t.right(360/n);
            }
            t.right(20);
         }
    }
}
