package Java_Learn.Strings;

public class ShortestPath {
    public static void main(String[] args) {
        // Given string has a path. Get the shortest path ...
        String path = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++) {
            char c = path.charAt(i);
            if(c == 'N')
                y++;
            else if(c == 'S')
                y--;
            else if(c == 'E')
                x++;
            else
                x--;
        }
        System.out.print("The shortest path is : " + Math.sqrt(x*x + y*y));
    }
}
