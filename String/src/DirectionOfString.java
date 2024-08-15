public class DirectionOfString {
    public static void shortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            int dir=str.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else x--;
        }
        int y2 = y*y, x2 = x*x;;
        float path=(float)Math.sqrt(x2+y2);
        System.out.println(path); 

    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        shortestpath(str);


    }
    
}
