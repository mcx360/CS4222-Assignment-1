//Michal Kornacki
//ID:22361979
public class imageDriver {
    public static void main (String[] args){
        int[][] pixels = new int[3][5];
        Image test = new Image(pixels);

        int row = 0;
        int col = 0;
        for(row=0;row<pixels.length;row++){  
            for(col=0; col<pixels[0].length; col++){
                pixels[row][col] = (int) (Math.random()*10);
            }
        }

        System.out.println("Default array:");
        System.out.println(test.toString());
        System.out.println("");

        //System.out.println("horizontaly flipped:");
        //test.flip(true);
        //System.out.println(test.toString());
        //System.out.println("");

        //System.out.println("vertically flipped:");
        //test.flip(false);
        //System.out.println(test.toString());
        //System.out.println("");
        //test.rotate(false);
        //System.out.println(test.toString());
        
        test.rotate(false);
        System.out.println("anti clockwise rotation:");
        System.out.println(test.toString());
              
        
    }

}




