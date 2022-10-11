public class StringGetPath {
    public static double getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            dir = Character.toUpperCase(dir);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (double)Math.sqrt(x2+y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
